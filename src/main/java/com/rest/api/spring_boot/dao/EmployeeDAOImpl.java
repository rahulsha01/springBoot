package com.rest.api.spring_boot.dao;


import com.mysql.cj.Session;
import com.rest.api.spring_boot.model.Employee;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entitiyManager;
    @Override
    public List<Employee> get() {
        Session currentSession = entitiyManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class );
        List<Employee> list = query.getResultList();
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
