package com.cts.employee.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "emp_id", nullable = false)
    private Long emp_id;

    private String employeeName;

    private String employeeEmail;

    private String department;

    private int employeeAge;

}
