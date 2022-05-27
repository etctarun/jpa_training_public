package com.cts.employee.controller;

import com.cts.employee.entity.Employee;
import com.cts.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    Logger logger= LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/api/v1/employee")
    public Employee saveNewEmployee(@RequestBody Employee employee){
       return service.saveEmployee(employee);
    }

    @GetMapping("/api/v1/employee/{id}")
    public Employee getEmployeeByID(@PathVariable long id){
        logger.debug("id queried is ..."+ id);
        return service.getEmployeeById(id);
    }

    @GetMapping("/api/v1/employee/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        logger.debug("name queried is ..."+ name);
        return service.getEmployeeByName(name);
    }

    @GetMapping("/api/v1/employee/{age}")
    public List<Employee> getEmployeeByAge(@PathVariable int age){
        logger.debug("age queried is ..."+ age);
        return service.getEmployeeByEmployeeAge(age);
    }
}
