package com.method;

import java.util.Scanner;


public class calculator {
	Scanner sc= new Scanner(System.in);
	int x, y;
	
	public calculator(){
	System.out.println("enter 1st number: ");
	 x = sc.nextInt();
	
	System.out.println("Enter 2nd number: ");
	 y =sc.nextInt();
	}

	public void  getAddition(){
	
		System.out.println("Addition " + (x+y));
	}
	
	public void getSubstraction() {
		System.out.println("Substraction" + (x-y));
	}
	 public void getDivision() {
	        if (y != 0) {
	            System.out.println("Division: " + ((double) x / y));
	        } else {
	            System.out.println("Cannot divide by zero.");
	        }
	    }
	public void  getMultiplication(){
		System.out.println("Multiplication "+(x*y));

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator obj = new calculator();
		obj.getAddition();
		obj.getSubstraction();
		obj.getDivision();
		obj.getMultiplication();

	}

}
