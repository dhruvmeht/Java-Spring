package com.daxasoft.bean;

public class Department {
	private String deptName;

	// Generate Getters and Setters

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}

	
	
}
