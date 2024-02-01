package com.car;
import java.util.*;
public class CarSelection {
	
static {
	System.out.println("Welcome to my Cars.");
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Tata\nPress 2 for Toyata\nPress 3 for Mahindra");
		System.out.println("Choose Your Fav Car: ");
		int car = sc.nextInt();
		
		switch(car) {
		case 1: 
			System.out.println("Tata");
			Operations.getTata();
			
			break;
		case 2:
			System.out.println("Toyata");
			Operations.getToyata();
			break;
		case 3:
			System.out.println("Mahindra");
			Operations.getMahindra();
			break;
		default:
			System.out.println("Invalid Car");
		}
					
	}

}