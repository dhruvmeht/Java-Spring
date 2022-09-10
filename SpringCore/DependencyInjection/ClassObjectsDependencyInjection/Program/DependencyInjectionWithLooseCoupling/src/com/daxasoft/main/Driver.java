package com.daxasoft.main;

import com.daxasoft.beans.Car;

public class Driver {
	
	private Car car;

	//Performing constructor Injection
	
	public Driver(Car car) {
		System.out.println("Peforming Constructor injection!!");
		this.car = car;
	}
	
	
	// Configuring Setters for the Car object 
	public void setCar(Car car) {
		System.out.println("Peforming Setter injection!!");
		this.car = car;
	}
	



	public void drive() {
		car.startCar();
		car.driveCar();
		car.stopCar();
	}
	

}
