package com.example.departmentdemo.repo;

import com.example.departmentdemo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
  public Department findBySEM(String sem);
}
