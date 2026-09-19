package com.microservielearn.depart_service.Repo;

import com.microservielearn.depart_service.Model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class departmentRepo {

    private List<Department> Departments = new ArrayList<>();

    public Department addDepartments(Department depart){
        Departments.add(depart);
        return  depart;
    }

    public Department findById(Long id){
        return Departments.stream()
                .filter(Departments ->
                        Departments.getId().equals(id))
                .findFirst()
                .orElseThrow();

    }

    public List<Department> findAll(){
        return Departments;
    }

}
