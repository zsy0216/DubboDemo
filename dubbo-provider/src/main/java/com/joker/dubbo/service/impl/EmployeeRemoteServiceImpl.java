package com.joker.dubbo.service.impl;

import com.joker.dubbo.entity.Employee;
import com.joker.dubbo.service.EmployeeRemoteService;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:com.joker.dubbo.service.impl
 * @Date:2019/10/18 14:02
 * @Author: zsy
 */
public class EmployeeRemoteServiceImpl implements EmployeeRemoteService {
    @Override
    public List<Employee> getEmployeeByConditionRemote(Employee employee) {
        System.out.println("***provider***:" + employee);

        // 假数据用于数据测试
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(111, "empName111", 111.11));
        empList.add(new Employee(222, "empName222", 222.22));
        empList.add(new Employee(333, "empName333", 333.33));
        return empList;
    }
}
