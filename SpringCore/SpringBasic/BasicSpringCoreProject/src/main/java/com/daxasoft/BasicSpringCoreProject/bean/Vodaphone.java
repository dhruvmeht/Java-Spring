package com.daxasoft.BasicSpringCoreProject.bean;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Vodaphone Sim Card!!");

	}

	@Override
	public void browse() {
		System.out.println("Browsing Internet from Vodaphone SimCard!! ");
	}

}
