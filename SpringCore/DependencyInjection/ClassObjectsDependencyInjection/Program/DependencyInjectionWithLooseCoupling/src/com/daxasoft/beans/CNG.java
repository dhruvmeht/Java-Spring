package com.daxasoft.beans;

public class CNG implements Car {

	@Override
	public void startCar() {
		System.out.println("CNG Car Started!!");
	}

	@Override
	public void driveCar() {
		System.out.println("CNG Car is moving at a speed of 60KM/hr");
	}

	@Override
	public void stopCar() {
		System.out.println("CNG Car Stopped!!");
	}

}
