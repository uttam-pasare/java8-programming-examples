package com.sb.exceptions.service;

import com.sb.exceptions.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee getEmployeeById(Integer id){
        //return employee by id
        return Employee.builder().id(id).name("John").gender("M").build();
    }
}
