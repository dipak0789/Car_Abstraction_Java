package com.product_encap;

import java.util.Scanner;

public class Set_Billings {
	public static void billings(){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b) {
			System.out.println("*******Welcome to Billing*******");
			System.out.println("Press 1 for set Billing Data\nPress 2 for get Billing Data\nPress 3 for Exit");
			switch(sc.nextInt()) {
			case 1: 
				Operations_Billing.setData();
				break;
			case 2:
				Operations_Billing.getData();
				break;
			case 3:
				b=false;
				break;
				
		    }
		}
	}
}
