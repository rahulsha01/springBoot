package com.rest.api.spring_boot.dao;


import org.hibernate.Session;
import com.rest.api.spring_boot.model.Employee;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entitiyManager;
    @Override
    public List<Employee> get() {
        Session currentSession = entitiyManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
        return list;
    }

    @Override
    public Employee get(int id) {
        Session currerntSession = entitiyManager.unwrap(Session.class);
        Employee employeeObj = currerntSession.get(Employee.class , id);
        return employeeObj;


    }

    @Override
    public void save(Employee employee) {
          Session currentSession = entitiyManager.unwrap(Session.class);
          currentSession.saveOrUpdate(employee);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entitiyManager.unwrap(Session.class);
        Employee employeeObj = currentSession.get(Employee.class, id);
        currentSession.delete(employeeObj);
    }
}
