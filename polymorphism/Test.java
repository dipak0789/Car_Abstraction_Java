package com.polymorphism;

public class Test {
//	Test(){
//		
//	} //New Construct override Default Constructor
	Test(int a){
		System.out.println("Constructor");
	}
	public void m1() {
		System.out.println("Inside m1");
	}
	public static void main(String args[]) {
		Test obj = new Test(10);
		//obj.m1();
	}
}
