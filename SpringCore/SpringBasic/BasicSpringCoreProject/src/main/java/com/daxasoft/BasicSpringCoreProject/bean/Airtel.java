package com.daxasoft.BasicSpringCoreProject.bean;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Airtel Sim Card!!");

	}

	@Override
	public void browse() {
		System.out.println("Browsing Internet from Airtel SimCard!! ");
	}

}
