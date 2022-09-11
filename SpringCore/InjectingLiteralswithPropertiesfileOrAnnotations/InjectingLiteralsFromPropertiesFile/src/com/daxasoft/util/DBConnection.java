package com.daxasoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class DBConnection {
	
	private String driverClass;
	private String URL;
	private String userName;
	private String password;
	
	//Generating Setters for Properties.
	//Injecting values using @Value Annotations
	//Injecting Values using setter Injection
	
	@Value("${student.driverClass}")
//	@SuppressWarnings("deprecation")
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	@Value("${student.URL}")
	public void setURL(String URL) {
		this.URL = URL;
	}
	@Value("${student.userName}")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Value("${student.password}")
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void displayInfo() {
		
		System.out.println("Driver Class :- "+driverClass 
							+"URL :- "+URL
							+"UserName :- "+userName
							+"Password :- "+password);
	}
	
	public void connectToDB() throws ClassNotFoundException, SQLException {
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(URL,userName,password);
		System.out.println("The connection Object is "+con.toString());
		
		
	}
	

}
