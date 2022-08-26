package com.training.spring.rest;

import com.training.spring.db.IEmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@RequestMapping("/employee")
// @RequestScope
// @SessionScope
// @ApplicationScope
public class EmployeeController {

    @Autowired
    private MyCountBean myCountBean1;
    @Autowired
    private MyCountBean myCountBean2;
    @Autowired
    private MyCountBean myCountBean3;

    @Autowired
    private IEmployeeDao employeeDao;

    @GetMapping("/hello")
    public String hello() {
        return "hello world " + myCountBean1.count() + " -  " + myCountBean2.count() + " -  " + myCountBean3.count();
    }

    @PostMapping("/hello")
    public String hello2() {
        return "hello world POST";
    }

    @GetMapping("/hello2/{xyz}/{abc}")
    public String hello(@PathVariable("xyz") String name,
                        @PathVariable("abc") String surname) {
        return "hello " + name + " " + surname;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("xyz") String name,
                         @RequestParam("abc") String surname) {
        return "hello " + name + " " + surname;
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        employeeDao.save(employee);
        return "Employee added : " + employee;
    }

    @PostMapping("/add2")
    public Employee addEmployee2(@RequestBody Employee employee) {
        employee.setName("deneme");
        return employee;
    }

    @GetMapping("/get/by/name")
    public List<Employee> getByName(@RequestParam("name")  String name){
        return employeeDao.findByName(name);
    }

}
