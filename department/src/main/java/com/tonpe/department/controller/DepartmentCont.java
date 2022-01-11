package com.tonpe.department.controller;

import com.tonpe.department.entity.Department;
import com.tonpe.department.service.DepartmentServ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentCont {
    @Autowired
    private DepartmentServ departmentServ;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("inside saveDepartment of Department controller");
        return departmentServ.saveDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId)
    {
        log.info("inside findDepartmentById of Department controller");
        return departmentServ.findDepartmentById(departmentId);
    }
}
