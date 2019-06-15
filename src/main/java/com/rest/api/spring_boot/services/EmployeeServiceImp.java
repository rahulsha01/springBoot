package com.rest.api.spring_boot.services;

import com.rest.api.spring_boot.dao.EmployeeDAO;
import com.rest.api.spring_boot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;
    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }

    @Override
    public Employee get(int id) {

        return employeeDAO.get(id);
    }

    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
