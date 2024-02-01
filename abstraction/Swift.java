package com.car.abstraction;

public class Swift extends Ms{
	
	public void getDealers() {
		System.out.println("Maruti Suzuki Dealer : JV motors");
	}

	@Override
	public void getMillage() {
		System.out.println("Millage : 20KM/Ltr");
	}

	@Override
	public void getColors() {
		System.out.println("Color : White");
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 6L");	
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)5 Star Saftey \n2)6 air Bags");
		
		
	}

}
