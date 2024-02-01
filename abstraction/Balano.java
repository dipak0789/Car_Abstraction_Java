package com.car.abstraction;

public class Balano extends Ms {
	public void getDealers() {
		System.out.println("Maruti Suzuki Dealer : JV motors");
	}

	@Override
	public void getMillage() {
		System.out.println("Millage : 10KM/Ltr");
	
	}

	@Override
	public void getColors() {
		System.out.println("Color : Brown");
		
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 14.5L");	
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)Cruise Control \n2)Parking Cameras");
		
	}

}
