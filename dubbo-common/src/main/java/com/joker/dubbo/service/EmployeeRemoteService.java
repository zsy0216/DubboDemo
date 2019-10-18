package com.joker.dubbo.service;

import com.joker.dubbo.entity.Employee;

import java.util.List;

/**
 * @PackageName:com.joker.dubbo.service
 * @Date:2019/10/18 11:14
 * @Author: zsy
 */
public interface EmployeeRemoteService {

    List<Employee> getEmployeeByConditionRemote(Employee employee);
}
