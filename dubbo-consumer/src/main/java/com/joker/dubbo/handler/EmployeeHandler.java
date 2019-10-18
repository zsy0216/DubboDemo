package com.joker.dubbo.handler;

import com.joker.dubbo.entity.Employee;
import com.joker.dubbo.service.EmployeeRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @PackageName:com.joker.dubbo.handler
 * @Date:2019/10/18 14:51
 * @Author: zsy
 */
@Controller
public class EmployeeHandler {

    @Autowired
    EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/get/emp/list")
    public String getEmpList() {
        Employee employee = new Employee(666, "empName666", 666.66);
        List<Employee> empList = employeeRemoteService.getEmployeeByConditionRemote(employee);
        for (Employee emp : empList) {
            System.out.println(emp);
        }
        return "success";
    }
}
