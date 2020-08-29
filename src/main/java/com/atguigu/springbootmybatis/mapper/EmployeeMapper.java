package com.atguigu.springbootmybatis.mapper;

import com.atguigu.springbootmybatis.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmployee(Integer id);

    public void insertEmp(Employee employee);
}
