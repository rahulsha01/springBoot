package com.rest.api.spring_boot.controller;

import com.rest.api.spring_boot.model.Employee;
import com.rest.api.spring_boot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get(){
            return employeeService.get();

    }

    @PostMapping(value = "/create_employee", produces = "application/json")
    public Employee save(@RequestBody Employee employeeObj){
        employeeService.save(employeeObj);
        return employeeObj;

    }

    @GetMapping("/employee/{id}")
    public  Employee get(@PathVariable int id) {
        return employeeService.get(id);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String delete(@PathVariable int id)
    {
         employeeService.delete(id);
         return "Record Successfully Deleted " + id;
    }

    @PutMapping(value = "/employee",  produces = "application/json")
    public Employee Update(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }


}
