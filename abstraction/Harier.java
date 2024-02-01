package com.car.abstraction;

public class Harier extends Tata{
	
	public void getDealers() {
		System.out.println("TATA Delear : AB Motors");
	}

	@Override
	public void getMillage() {
		System.out.println("MIillage : 12Km/Ltr");
		
	}

	@Override
	public void getColors() {
		System.out.println("Color : Black");		
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 12L");		
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)Air Condition \n2)5 Star Saftey.");
		
	}

}
