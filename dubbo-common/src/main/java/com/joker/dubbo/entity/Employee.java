package com.joker.dubbo.entity;

import java.io.Serializable;

/**
 * @PackageName:com.joker.dubbo.entity
 * @Date:2019/10/18 11:11
 * @Author: zsy
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer empId;
    private String empName;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer empId, String empName, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
