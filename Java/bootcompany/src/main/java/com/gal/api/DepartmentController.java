package com.gal.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gal.model.Department;
import com.gal.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	//private static final Logger Log =LoggerFactory.getLogger("com.gal");
	private static final Logger Log =LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    DepartmentService departmentService;

    //department by id using RequestParam
    //department?id=10
    @GetMapping
    public Department getDepartmentById(@RequestParam("id") int id) {
       Department department= departmentService.find(id);
	   return department;
    }

    // department by id using PathVariable
    @GetMapping("/{id}")
    public ResponseEntity<?> getDepartment(@PathVariable int id) {
        Log.debug("request for department with id: {}", id);

        Department d = departmentService.find(id);

        if (d == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Department with id " + id + " not found");
        }

        return ResponseEntity.ok(d);
    }

    // department by name
 
    @GetMapping("byname")
    public Department getDepartmentByName(@RequestParam("name") String name) {
        Department department= departmentService.findByName(name);
        return department;
    }
    @PostMapping(consumes="application/json",produces="application/json")
    Department addDepartmnet(@RequestBody Department department) {
    	Log.debug("request for adding dep"+department);
    	Department saved=departmentService.addDepartment(department);
    	return saved;
    }
    @PutMapping(consumes="application/json",produces="application/json")
    Department updateDepartmnet(@RequestBody Department department) {
    	Log.debug("request for updating dep"+department);
    	Department saved=departmentService.update(department);
    	return saved;
    }
}