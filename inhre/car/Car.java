package com.inhre.car;
import java.util.*;
public class Car {
	public static void main (String args[]) {
		System.out.println("Press 1 for Tata\nPress 2 for BMW\nPress 3 for Mahindra");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			CarTata ct = new CarTata();
			ct.getTata();
			break;
		case 2:
			CarBmw cb =new CarBmw();
			cb.getBMW();
			break;
		case 3:
			CarMahindra cm = new CarMahindra();
			cm.getMahindra();
			
			default: 
				System.out.println("Invalid option");
				break;
		}
	}
}	
