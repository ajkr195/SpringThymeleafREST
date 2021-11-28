package com.spring.boot.rocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.rocks.model.Employee;
import com.spring.boot.rocks.model.paging.Page;
import com.spring.boot.rocks.model.paging.PageArray;
import com.spring.boot.rocks.model.paging.PagingRequest;
import com.spring.boot.rocks.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Page<Employee> list(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployees(pagingRequest);
    }

    @PostMapping("/array")
    public PageArray array(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployeesArray(pagingRequest);
    }
}
