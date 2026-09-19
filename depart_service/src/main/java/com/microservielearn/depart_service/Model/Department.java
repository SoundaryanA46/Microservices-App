package com.microservielearn.depart_service.Model;
import java.util.ArrayList;
import java.util.List;

public class Department {


    private Long id;

    private String name;

    private List<Employee>  employes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employee> employes) {
        this.employes = employes;
    }

    @Override
    public String toString() {
        return "department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employes=" + employes +
                '}';
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }


}
