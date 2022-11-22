package com.accolite.employee.beans;

public class Employee {
	int eID, salary ;
	long phone_no;
	String name,email;
	
	public Employee(int eID, String name, String email, int salary, long phone_no) {
		super();
		this.eID = eID;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.phone_no = phone_no;
		
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", salary=" + salary + ", phone_no=" + phone_no + ", name=" + name + ", email="
				+ email + ", geteID()=" + geteID() + ", getSalary()=" + getSalary() + ", getPhone_no()=" + getPhone_no()
				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}


