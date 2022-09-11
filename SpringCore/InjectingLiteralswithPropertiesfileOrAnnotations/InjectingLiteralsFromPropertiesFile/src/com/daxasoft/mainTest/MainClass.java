package com.daxasoft.mainTest;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxasoft.util.DBConnection;

public class MainClass {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DBConnection conBean = context.getBean("DBClass",DBConnection.class);
		conBean.displayInfo();
		conBean.connectToDB();
	}

}
