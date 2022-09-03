package com.daxasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxasoft.bean.Car;
import com.daxasoft.bean.DriverA;

public class CallDriver {
	public static void main(String[] args) {
//		Car car = new Car();
//		DriverA driver=new DriverA();
//		driver.setCar(car);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DriverA driver=context.getBean("driverA",DriverA.class);
		driver.drive();
	}

}
