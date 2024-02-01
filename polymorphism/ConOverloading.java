package com.polymorphism;

public class ConOverloading {
	 ConOverloading(){
		System.out.println("Constructor with no parameter");
	}
	 ConOverloading(int a ) {
		System.out.println("costructor wtih Parameter");
	}
	public static void main(String args[]) {
		ConOverloading obj = new ConOverloading(10);
	}
}
