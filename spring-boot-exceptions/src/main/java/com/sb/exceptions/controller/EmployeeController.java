package com.sb.exceptions.controller;

import com.sb.exceptions.exception.EmployeeNotFound;
import com.sb.exceptions.model.Employee;
import com.sb.exceptions.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) throws EmployeeNotFound{
        Employee employee = null;// = employeeService.getEmployeeById(id);
        if(Objects.isNull(employee)){
            throw new EmployeeNotFound("Employee not found for " + id);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<Object> handleNotFound(EmployeeNotFound employeeNotFoundException){
        System.out.println(employeeNotFoundException.getMessage());
        return new ResponseEntity<>(employeeNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }


}
