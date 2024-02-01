package com.car.abstraction;
import java.util.*;
public class Operations {
	public static void getMsinfo() {
		System.out.println("Welcome to Maruti Suzuki.");
		System.out.println("Press 1 for Swift\nPress 2 for Balano.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Swift st = new Swift();
			st.getDealers();
			st.getMillage();
			st.getColors();
			st.getPrice();
			st.getFeatures();
			break;
		case 2:
			Balano bl = new Balano();
			bl.getDealers();
			bl.getMillage();
			bl.getColors();
			bl.getPrice();
			bl.getFeatures();
			break;
		default :
			System.out.println("Invalid Car");
			break;
		}
	}
	public static void  getTatainfo() {
		System.out.println("Welcome to Tata.");
		System.out.println("Press 1 for Safari.\nPress 2 for Harier.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			Safari sf = new Safari();
			sf.getDealers();
			sf.getMillage();
			sf.getColors();
			sf.getPrice();
			sf.getFeatures();
			break;
		case 2:
			Harier hr = new Harier();
			hr.getDealers();
			hr.getMillage();
			hr.getColors();
			hr.getPrice();
			hr.getFeatures();
			break;
		default :
			System.out.println("Invalid Car");
			break;

			
		}
	}
	public static void getBMWinfo() {
		System.out.println("Welcome to BMW.");
		System.out.println("Press 1 for X5\nPress 2 for X6");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			X5 obj = new X5();
			obj.getDealers();
			obj.getMillage();
			obj.getColors();
			obj.getPrice();
			obj.getFeatures();
			break;
		case 2:
			X6 obj2 = new X6();
			obj2.getDealers();
			obj2.getMillage();
			obj2.getColors();
			obj2.getPrice();
			obj2.getFeatures();
			break;
		default :
			System.out.println("Invalid Car");
			break;

		}

	}
	public static void main(String args[]) {
		System.out.println("Select Your Car Company.");
		System.out.println("Press 1 for Ms\nPress 2 for Tata\nPress 3 for BMW ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		Operations or =new Operations();
		switch (ch) {
		case 1 : 
			or.getMsinfo();
			break;
		case 2:
			 or.getTatainfo();
			 break;
		case 3:
			or.getBMWinfo();
			default:
				System.out.println("Invalid Car Company");
				break;
			
		}
	}
}
