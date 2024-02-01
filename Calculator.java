package com.switchoperator;
import java.util.*;
public class Calculator {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a= sc.nextInt();
		System.out.print("Enter the second Number: ");
		int b= sc.nextInt();
		String calculator = sc.next();
		
		switch(calculator) {
		 
		case "Addition":
			System.out.println("Addition of two number is :"+ (a+b));
			break;
		case "Substration" :
			System.out.println("Subtraction of two number is: "+ (a-b));
			break;
		case "Multiplication":
			System.out.println("Multiplication of two Number is: "+(a*b));
			break;
		case "Division":
			System.out.println("Division of two number is : "+(a/b));
			break;
		default:
			System.out.println("Invalid case");
			break;
				
		}
		
		
	}
}
