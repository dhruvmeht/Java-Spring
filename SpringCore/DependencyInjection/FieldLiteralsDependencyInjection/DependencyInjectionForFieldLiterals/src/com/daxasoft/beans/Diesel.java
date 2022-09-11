package com.daxasoft.beans;

public class Diesel implements Engine {
	
	private String engineManufacturer;
	private int engineHorsePower;
	
	
	

	public Diesel(String engineManufacturer, int engineHorsePower) {
		this.engineManufacturer = engineManufacturer;
		this.engineHorsePower = engineHorsePower;
	}

	public void setEngineManufacturer(String engineManufacturer) {
		this.engineManufacturer = engineManufacturer;
	}

	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	
	

	@Override
	public void startEngine() {
		System.out.println("Diesel Engine "+engineManufacturer+" started !!");

	}

	@Override
	public void driveCar() {
		System.out.println("Engine "+engineManufacturer+" has a power of "+engineHorsePower);

	}

}
