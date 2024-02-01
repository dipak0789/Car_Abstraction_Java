package com.car.abstraction;

public class Safari extends Tata{
	
	public void getDealers() {
		System.out.println("TATA Delear : AB Motors");
	}


	@Override
	public void getMillage() {
		System.out.println("Millage : 8Km/Ltr");
		
	}

	@Override
	public void getColors() {
		System.out.println("Color : White");
		
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 20L");
		
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)SunRoof \n2)Cruise Control");
		
	}

}
