package com.tonpe.department.repo;

import com.tonpe.department.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {

    Department findByDepartmentId(long departmentId);
}
