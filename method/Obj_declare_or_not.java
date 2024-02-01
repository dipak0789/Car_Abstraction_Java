package com.method;

public class Obj_declare_or_not {
	public static void m1(){
		System.out.println("inside m1");
	}
	
	public  void m2() {
		System.out.println("inside m2");
		}
	public static void main(String args[]) {
		Obj_declare_or_not.m1();
		Obj_declare_or_not obj = new Obj_declare_or_not();
		obj.m2();
		
	}
}