package com.daxasoft.beans;

public class Electric implements Car {

	@Override
	public void startCar() {
		System.out.println("Electric Car Started!!");
	}

	@Override
	public void driveCar() {
		System.out.println("Electric Car is moving at a speed of 60KM/hr");
	}

	@Override
	public void stopCar() {
		System.out.println("Electric Car Stopped!!");
	}

}
