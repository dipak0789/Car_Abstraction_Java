package com.product_encap;
import java.util.*;
public class Set_Shop {
	public static  void product(){
		Scanner sc =new Scanner(System.in);	
		boolean b =true;
		while(b) {
			System.out.println("*******Welcome to Shop*******");
			System.out.println("Press 1 for Set Product data\n press 2for get Product Data\nPress 3 for Update  Data\nPress 4 for Exit");
			switch(sc.nextInt()) {
			case 1:
				Operation.setData();
				break;
			case 2:
				Operation.getData();
				break;
     		case 3:
				Operation.updateData();
				break;
			case 4:
				b=false;
			    break;
			}
		}
		
	}
}
