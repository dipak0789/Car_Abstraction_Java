package com.car.abstraction;

public class X5 extends BMW {
	
	public void getDealers() {
		System.out.println("BMW Dealer : BM Motors");
	}

	@Override
	public void getMillage() {
		System.out.println("Millage : 12Km/Ltr");
	}

	@Override
	public void getColors() {
		System.out.println("Color : Blue");		
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 35L");		
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)Automatic Driving \n2)5 Star Saftey");		
	}
	

}
