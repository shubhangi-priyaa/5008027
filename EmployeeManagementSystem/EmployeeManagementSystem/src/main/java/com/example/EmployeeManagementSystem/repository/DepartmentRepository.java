package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.projection.DepartmentProjection;
import com.example.EmployeeManagementSystem.projection.DepartmentSummary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom query method to find departments by name
    List<Department> findByName(String name);
@Query("SELECT d FROM Department d")
    List<DepartmentProjection> findDepartmentProjections();

    // Using class-based projection
    @Query("SELECT new com.example.EmployeeManagementSystem.projection.DepartmentSummary(d.id, d.name) FROM Department d")
    List<DepartmentSummary> findDepartmentSummaries();

}
