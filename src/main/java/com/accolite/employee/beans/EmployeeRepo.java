package com.accolite.employee.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component
public class EmployeeRepo {
	
	Employee Damini;
	Employee Ritiksha;
	public Employee getDamini(){
		return Damini;
	}

	@Autowired
	@Qualifier("Damini")
	public void setDamini(Employee Damini) {
		this.Damini = Damini;
	}


	public Employee getRitiksha() {
		return Ritiksha;
	}
	@Autowired
	@Qualifier("Ritiksha")
	public void setRitiksha(Employee Ritiksha) {
		this.Ritiksha = Ritiksha;
	}
}

