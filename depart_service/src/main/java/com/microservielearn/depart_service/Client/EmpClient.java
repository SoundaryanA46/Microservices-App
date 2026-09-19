package com.microservielearn.depart_service.Client;

import com.microservielearn.depart_service.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmpClient {

@GetExchange("/employee/dept/{departmentId}")
public List<Employee> findAllDept(@PathVariable("departmentId") Long departmentId);
    }

