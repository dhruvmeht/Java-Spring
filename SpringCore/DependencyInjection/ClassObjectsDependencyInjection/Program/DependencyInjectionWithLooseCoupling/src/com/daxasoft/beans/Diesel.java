package com.daxasoft.beans;

public class Diesel implements Car {

	@Override
	public void startCar() {
		System.out.println("Diesel Car Started!!");
	}

	@Override
	public void driveCar() {
		System.out.println("Diesel Car is moving at a speed of 60KM/hr");
	}

	@Override
	public void stopCar() {
		System.out.println("Diesel Car Stopped!!");
	}

}
