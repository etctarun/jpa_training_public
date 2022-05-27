package com.cts.employee.service;

import com.cts.employee.entity.Employee;
import com.cts.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public Employee saveEmployee(Employee employee){
        logger.debug("Passed in employee details for email " + employee.getEmployeeEmail());
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id){
        logger.debug("Passed in employee id " + id);
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getEmployeeByName(String name){
        logger.debug("Passed in employee Name " + name);
        return employeeRepository.findByEmployeeName(name);
    }

    public List<Employee> getEmployeeByNameSorted(String name){
        logger.debug("Passed in employee Name " + name);
        return employeeRepository.findByEmployeeNameOrderByEmployeeName(name);
    }

    public List<Employee> getEmployeeByEmployeeAge(int age){
        logger.debug("Passed in employee Age " + age);
        return employeeRepository.findByEmployeeAge(age);
    }
}
