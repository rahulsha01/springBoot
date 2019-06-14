package com.rest.api.spring_boot.services;

import com.rest.api.spring_boot.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
