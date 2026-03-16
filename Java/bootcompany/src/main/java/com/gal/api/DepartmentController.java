package com.gal.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gal.model.Department;
import com.gal.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    //department by id using RequestParam
    
    @GetMapping
    public Department getDepartmentById(@RequestParam int id) {
        return departmentService.find(id);
    }

    // department by id using PathVariable
   
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id) {
        return departmentService.find(id);
    }

    // department by name
 
    @GetMapping("/byname")
    public Department getDepartmentByName(@RequestParam String name) {
        return departmentService.findByName(name);
    }
}