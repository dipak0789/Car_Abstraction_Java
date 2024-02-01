package com.method;

public class NonStaticmethod {
	public void m1(){
		System.out.println("inside m1");
	}
	
	public  void m2() {
		System.out.println("inside m2");
	}
	public static void main(String args[]) {
		NonStaticmethod obj = new NonStaticmethod();
		obj.m1();
		obj.m2();
	}

	
}
