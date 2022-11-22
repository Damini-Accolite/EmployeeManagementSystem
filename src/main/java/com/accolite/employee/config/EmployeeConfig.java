package com.accolite.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.accolite.employee.beans.Employee;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan(basePackages = {"com.accolite.employee.beans", "com.accolite.employee.controller", "com.accolite.employee.service"})
public class EmployeeConfig {
	@Bean("Damini")
	public Employee employee1() {
		return new Employee(686, "Damini", "damini.kumari@accolitedigital.com", 500000, 9876543210L );
	}

	@Bean("Ritiksha")
	public Employee employee2() {
		return new Employee(686, "Ritiksha", "ritiksha.singh@accolitedigital.com", 600000, 9876546211L );
	}
	
}

