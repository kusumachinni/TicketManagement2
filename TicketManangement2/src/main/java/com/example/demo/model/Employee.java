package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="EmployeeTable")
@NoArgsConstructor
@Data
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer employeeId;
@NonNull
private String employeeName;
@NonNull
private String employeeDesignation;
@NonNull
private String employeePassword;
@NonNull
private Double employeePhoneno;
@NonNull
private String employeeEmail;
@NonNull
private Boolean isEmployeeAvailable=true;

@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
private List<Ticket> ticket;


}
