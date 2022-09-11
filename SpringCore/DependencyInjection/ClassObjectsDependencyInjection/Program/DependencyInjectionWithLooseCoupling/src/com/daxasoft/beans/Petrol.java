package com.daxasoft.beans;

public class Petrol implements Car {

	@Override
	public void startCar() {
		System.out.println("Petrol Car Started!!");
	}

	@Override
	public void driveCar() {
		System.out.println("Petrol Car is moving at a speed of 60KM/hr");
	}

	@Override
	public void stopCar() {
		System.out.println("Petrol Car Stopped!!");
	}

}
