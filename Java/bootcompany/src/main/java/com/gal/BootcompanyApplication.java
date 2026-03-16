package com.gal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gal.model.Department;
import com.gal.service.DepartmentService;

@SpringBootApplication
public class BootcompanyApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(BootcompanyApplication.class, args);

        DepartmentService service = context.getBean(DepartmentService.class);

        Department d1 = new Department();
        d1.setDepartmentid(101);
        d1.setDepname("CS");
        service.add(d1);
        System.out.println(service.find(101));
        service.findAll().forEach(System.out::println);
        Department updateDept = new Department();
        updateDept.setDepartmentid(101);
        updateDept.setDepname("Computer Science");
        service.update(updateDept);
        service.findAll().forEach(System.out::println);
        service.delete(101);
        service.findAll().forEach(System.out::println);

    }
}