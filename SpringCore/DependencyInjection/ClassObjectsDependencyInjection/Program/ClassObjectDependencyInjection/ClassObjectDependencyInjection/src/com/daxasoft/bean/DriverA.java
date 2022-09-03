package com.daxasoft.bean;

public class DriverA {
	private Car car;
	
	
	public void setCar(Car car) {
		this.car = car;
	}


	public void drive() {
		
		car.startEngine();
		System.out.println("Journey started!!");
		System.out.println("Reached Destination!!");
		car.stopEngine();
	}

}
