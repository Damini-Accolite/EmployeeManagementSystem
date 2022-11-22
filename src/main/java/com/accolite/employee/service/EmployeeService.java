package com.accolite.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accolite.employee.beans.Employee;
import com.accolite.employee.beans.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
	@Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeeDetails(){
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(employeeRepo.getDamini());
        employee.add(employeeRepo.getRitiksha());

        return employee;
    }
}

