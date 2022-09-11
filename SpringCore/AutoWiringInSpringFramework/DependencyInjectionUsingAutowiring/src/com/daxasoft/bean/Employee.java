package com.daxasoft.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String empName;
	private String empAddress;
	@Autowired
	@Qualifier("javadept")
	private Department department;
	
	
	
	
//	public Employee() {
//
//	}
//
//	public Employee(Department department) {
//
//		this.department = department;
//	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Department getDepartment() {
		return department;
	}
//	@Autowired
//	@Qualifier("javadept")
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", department=" + department + "]";
	}
	
	
	
	

}
