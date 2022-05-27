package com.cts.employee.repository;

import com.cts.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByEmployeeName(String name);

    List<Employee> findByEmployeeNameOrderByEmployeeName(String name);

    List<Employee> findByEmployeeAge(int age);


    List<Employee> findByEmployeeNameOrderByEmployeeAgeDesc(String name);

    List<Employee> findByEmployeeAgeBetween(int startAge , int endAge);
}
