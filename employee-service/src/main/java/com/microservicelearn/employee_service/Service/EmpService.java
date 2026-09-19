package com.microservicelearn.employee_service.Service;

import com.microservicelearn.employee_service.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {

    List<Employee> employees = new ArrayList<>();


    public Employee addemployees(Employee emp){
         employees.add(emp);
         return emp;
    }

    public Employee findById(long id){
        return employees.stream()
                .filter(employees -> employees.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee>  findAll()
    {
        return employees;
    }

    public Employee findByName(String name){
        return employees.stream()
                .filter(e -> e.name().equals(name))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee>  findByDept(Long departmentId){
        return employees.stream()
                .filter(e->e.departmentId().equals(departmentId))
                .toList();
    }
 }
