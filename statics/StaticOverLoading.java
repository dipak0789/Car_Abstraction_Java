package com.statics;

public class StaticOverLoading {
	public static void m1() {
		System.out.println("Inside m1");
	}
	public static void m1(int a) {
		System.out.println("With Parameter");
	}
	public static void m1(int a, String b) {
		System.out.println("int a, String b Parameter");
	}
	public static void main(String args[]) {
		StaticOverLoading.m1(10,"Dipak");
		StaticOverLoading.m1();
		StaticOverLoading.m1(10);
	}

}
