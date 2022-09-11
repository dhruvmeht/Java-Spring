package com.daxasoft.beans;

public class Petrol implements Engine {
	
	private String engineManufacturer;
	private int engineHorsePower;
	
	
	
	

	public Petrol(String engineManufacturer, int engineHorsePower) {
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
		System.out.println("Petrol Engine "+engineManufacturer+" started !!");

	}

	@Override
	public void driveCar() {
		System.out.println("Engine "+engineManufacturer+" has a power of "+engineHorsePower);

	}

}
