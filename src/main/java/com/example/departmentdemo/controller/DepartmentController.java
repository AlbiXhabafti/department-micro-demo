package com.example.departmentdemo.controller;

import com.example.departmentdemo.model.Department;
import com.example.departmentdemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getAll")
    public List<Department>getAll(){
        return departmentService.getAllDepartment();
    }
    @GetMapping("{id}")
    public Department getById(@PathVariable("id") Long id){
    return departmentService.getDepartmentById(id);
    }
    @PostMapping
    public String saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return "Successful";
    }
    @GetMapping("/rest")
    public Department getByName(@RequestParam("SEM") String name){
        return departmentService.getByName(name);
    }
}
