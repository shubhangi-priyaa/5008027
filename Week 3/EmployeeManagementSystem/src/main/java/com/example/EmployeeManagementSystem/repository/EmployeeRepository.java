package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeProjection;
import com.example.EmployeeManagementSystem.projection.EmployeeSummary;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom query method to find an employee by email
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findByEmail(@Param("email") String email);

    // Custom query method to find employees by department name
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    Page<Employee> findByDepartmentName(@Param("departmentName") String departmentName, Pageable pageable);

     @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<EmployeeProjection> findEmployeeProjectionsByDepartmentName(String departmentName);

    // Using class-based projection
    @Query("SELECT new com.example.EmployeeManagementSystem.projection.EmployeeSummary(e.id, e.name, e.email) FROM Employee e WHERE e.department.name = :departmentName")
    List<EmployeeSummary> findEmployeeSummariesByDepartmentName(String departmentName);

}
