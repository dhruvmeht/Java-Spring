package com.daxasoft.testmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxasoft.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
		
	}

}
