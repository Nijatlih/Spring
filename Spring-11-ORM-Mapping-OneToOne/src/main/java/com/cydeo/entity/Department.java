package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity {

    private String department;
    private String division;

    @OneToOne(mappedBy = "department") //mappedBy = "department" -> ownership is Employee table
    private Employee employee;         //create department column in Employee table

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
