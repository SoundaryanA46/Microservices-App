package com.microservielearn.depart_service.Controller;


import com.microservielearn.depart_service.Client.EmpClient;
import com.microservielearn.depart_service.Model.Department;
import com.microservielearn.depart_service.Model.Employee;
import com.microservielearn.depart_service.Repo.departmentRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@RestController
@RequestMapping("/department")
public class departmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(departmentController.class);

    @Autowired
    private departmentRepo departmentRepo;

    @Autowired
    private EmpClient empClient;

    @PostMapping()
    public Department addDepartment(@RequestBody Department depart){
        LOGGER.info("Department add: {}",depart);
        return departmentRepo.addDepartments(depart);
    }

    @GetMapping()
    public List<Department> getAll(){
        LOGGER.info("Department find");
        return departmentRepo.findAll();
    }

    @GetMapping("/{id}")
    public Department getId(@PathVariable Long id){
        LOGGER.info("Department find: id={}",id);
     return  departmentRepo.findById(id);
    }

    @GetMapping("/with-emp")
    public List<Department> getAllWithEmp(){
        LOGGER.info("Department find with emp");
        List<Department> departments = departmentRepo.findAll();
        departments.forEach(d-> d
                .setEmployes(empClient.findAllDept(d.getId())));

        return departments;
    }


}
