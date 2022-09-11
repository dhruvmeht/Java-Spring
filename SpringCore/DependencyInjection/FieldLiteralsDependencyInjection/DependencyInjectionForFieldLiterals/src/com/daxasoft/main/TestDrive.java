package com.daxasoft.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxasoft.beans.Diesel;

public class TestDrive {

	public static void main(String[] args) {
//		Petrol engine = new Petrol();
//		engine.setEngineManufacturer("Revtorq engine");
//		engine.setEngineHorsePower(110);
//		engine.startEngine();
//		engine.driveCar();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Diesel engine = context.getBean("petrol", Diesel.class);
		engine.startEngine();
		engine.driveCar();
		
	}

}
