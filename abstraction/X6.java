package com.car.abstraction;

public class X6 extends BMW {
	
	public void getDealers() {
		System.out.println("BMW Dealer : BM Motors");
	}


	@Override
	public void getMillage() {
		System.out.println("Millage : 7Km/Ltr");
	}

	@Override
	public void getColors() {
		System.out.println("Color : Grey");		
	}

	@Override
	public void getPrice() {
		System.out.println("On Road Price : 45L");
		
	}

	@Override
	public void getFeatures() {
		System.out.println("Features : \n1)SunRoof \n2)6Air Bags");		
	}

}
