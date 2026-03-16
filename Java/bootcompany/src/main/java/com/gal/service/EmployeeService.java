package com.gal.service;

import java.util.List;
import com.gal.model.Employee;

public interface EmployeeService {

    Employee find(int empId);

    List<Employee> findAll();

    void add(Employee employee);

    void delete(int empId);

    void update(Employee employee);

    Employee findByFirstname(String firstname);

    Employee findByLastname(String lastname);
}