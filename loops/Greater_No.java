package com.loops;
import java.util.*;

public class Greater_No {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y= sc.nextInt();
//		int z= sc.nextInt();
//		
//		if(x>y && x>z) {
//			System.out.println(x);
//		}else if(y>x && y>z) {
//			System.out.println(y);
//		}else {
//			System.out.println(z);
//		}
		System.out.print("Enter the marks: ");
		int marks= sc.nextInt();
		if(marks>=75) {
			System.out.println("Distinction");
		}else if (marks>=60 && marks<75) {
			System.out.println("Firstclass");
		}else if(marks<60 && marks>=50){
			System.out.println("SeconClass");
		}else if(marks>=35 && marks<50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
