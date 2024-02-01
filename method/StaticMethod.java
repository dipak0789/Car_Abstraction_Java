package com.method;

public class StaticMethod {
	
	public static void m1(){
		System.out.println("inside m1");
	}
	
	public static void m2() {
		System.out.println("inside m2");
	}
	
	public static void main(String args[]) {
		StaticMethod.m1();
		StaticMethod.m2();
	}
}

