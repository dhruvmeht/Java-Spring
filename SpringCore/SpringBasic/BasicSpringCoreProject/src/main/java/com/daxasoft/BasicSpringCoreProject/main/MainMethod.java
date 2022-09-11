package com.daxasoft.BasicSpringCoreProject.main;

import org.springframework.aop.TargetClassAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxasoft.BasicSpringCoreProject.bean.Sim;

public class MainMethod {
	public static void main(String[] args) {

//		Sim sim = new Jio();
		// Intializing spring framework to load the configuration file for bean creation
		// in IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Loading the object from the IOC container
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.browse();
	}

}
