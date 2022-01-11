package com.tonpe.department.service;

import com.tonpe.department.entity.Department;
import com.tonpe.department.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServ {
    @Autowired
    private DepartmentRepo departmentRepo;


    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of Department service");

        return departmentRepo.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        log.info("inside findDepartmentById of Department service");

        return departmentRepo.findByDepartmentId(departmentId);
    }
}
