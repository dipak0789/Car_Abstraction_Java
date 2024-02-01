package com.car;
import java.util.*;
public class Operations {

	public  static void getTata() { 
		Scanner sc = new Scanner(System.in);
		System.out .println("Press 1 For Altroz\nPress 2 For Safari");
		int ch = sc.nextInt();
		Tata obj = new Tata();
		switch(ch) {
		case 1:
			obj.getAltrozifo();
			break;
		case 2:
			obj.getSafariinfo();
			default:
				System.out.println("Invalid option");
		}
	}
		
	public static void getToyata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 For fortuner\nPress 2 For Supra");
		int ch = sc.nextInt();
		Toyata obj2 =new Toyata();
		switch(ch) {
		case 1 :
			obj2.getFortunerinfo();
			break;
		default:
				System.out.println("invalid option");
		
	}	
}
	public static void getMahindra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 For SUV700\nPress 2 For Thar");
		int ch = sc.nextInt();
		Mahindra obj3 =new Mahindra();
		switch(ch) {
		case 1 :
			obj3.getSUV700info();
			break;
		case 2:
			obj3.getTharinfo();
			break;
			default:
				System.out.println("System.out.println");
		
	}	
}

}
