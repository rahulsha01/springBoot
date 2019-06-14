package com.rest.api.spring_boot.services;

import com.rest.api.spring_boot.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Transactional
    @Override
    public List<Employee> get() {
        return null;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
