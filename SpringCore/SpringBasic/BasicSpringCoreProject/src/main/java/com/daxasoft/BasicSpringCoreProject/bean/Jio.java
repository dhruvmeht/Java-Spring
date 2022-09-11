package com.daxasoft.BasicSpringCoreProject.bean;

public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from JIO Sim Card!!");

	}

	@Override
	public void browse() {
		System.out.println("Browsing Internet from JIO SimCard!! ");
	}

}
