package com.example.departmentdemo.service;

import com.example.departmentdemo.model.Department;
import com.example.departmentdemo.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department>getAllDepartment(){
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).get();
    }
    public Department saveDepartment(Department department){
        return  departmentRepository.save(department);
    }
    public Department getByName(String sem ){
        return departmentRepository.findBySEM(sem);
    }


}
