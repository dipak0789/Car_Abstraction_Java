package com.polymorphism;
//compile time polymorphism.
public class Overloading {
	public void m1() {
		System.out.println("no parameters");
	}
	public void m1(int a) {
		System.out.println("int parameter");
	}
	public void m1(int a, int b) {
		System.out.println("int1 , int2 parameters");
	}
	public static void main(String args[]) {
		Overloading ol =new Overloading();
		ol.m1();
		ol.m1(10);
		ol.m1(10,30);
	}
}
