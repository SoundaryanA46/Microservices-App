package com.microservicelearn.employee_service.Controller;


import com.microservicelearn.employee_service.Model.Employee;
import com.microservicelearn.employee_service.Service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private EmpService empService;

    @GetMapping("/id/{id}")
    public Employee findById(@PathVariable Long id){
        LOGGER.info("Employee find : id={}",id);
        return empService.findById(id);
    }

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee emp){
        LOGGER.info("Employee add : emp={}",emp);
        return empService.addemployees(emp);
    }

    @GetMapping()
    public List<Employee> findAll(){
        LOGGER.info("Employee find");
        return empService.findAll();
    }

    @GetMapping("/{name}")
    public Employee findByName(@PathVariable String name){
        LOGGER.info("Department find: name={}",name);
        return empService.findByName(name);
    }

    @GetMapping("/dept/{departmentId}")
    public List<Employee> findAllDept(@PathVariable Long departmentId){
        LOGGER.info("Department find : deptartmentId:{}",departmentId);
        return empService.findByDept(departmentId);
    }

}
