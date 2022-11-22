package com.accolite.employee.beans;

public class Dept {
	String dname,dcode;
	
	public Dept(String dname, String dcode) {
		super();
		this.dname = dname;
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	@Override
	public String toString() {
		return "Dept [dname=" + dname + ", dcode=" + dcode + ", getDname()=" + getDname() + ", getDcode()=" + getDcode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

