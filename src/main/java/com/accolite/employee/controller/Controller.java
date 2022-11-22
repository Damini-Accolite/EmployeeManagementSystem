package com.accolite.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.employee.beans.Employee;
import com.accolite.employee.service.EmployeeService;
import java.util.List;

@RestController
public class Controller {
	EmployeeService service;

    public EmployeeService getService(){
        return service;
    }

    @Autowired
    public void setService(EmployeeService service){
        this.service = service;
    }

  @RequestMapping("/Damini")
    public List<Employee> getEmployee(){
        return getService().getEmployeeDetails();
    }

}


