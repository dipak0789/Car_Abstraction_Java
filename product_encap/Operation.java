package com.product_encap;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Operation {
	static Scanner sc = new Scanner(System.in);
	static Shop sh = new Shop();
	
	public static void setData() {
		System.out.println("Enter Product Id : ");
		
		sh.setProductId(sc.nextInt()); 
		
		System.out.println("Enter Product Name");
		sh.setName(sc.next());
		
		System.out.println("Enter the Product Price");
		double price = sc.nextDouble();
		double pricewithGST = price *1.18;
	    sh.setPrice(price);
	    sh.setPricewithGST(pricewithGST);
	    System.out.println("Enter the stock:");
	    sh.setStock(sc.nextInt());
	    sh.setTime(LocalTime.now());
	    sh.setUpdatedStatus("Product is new and not Updated after registration");
	}
	
	public static void getData() {
		System.out.println("*******Product Information*******");
		System.out.println("Product Id is : "+sh.getProductId());
		System.out.println("Product Name is : "+sh.getName());
		System.out.println("Product Price is : "+sh.getPrice());
		System.out.println("Price with GST is :"+sh.getPricewithGST());
		System.out.println("Availale stock is : "+sh.getStock());
		System.out.println("New product updated at : "+sh.getTime());
		System.out.println("Updated Status : "+ sh.getUpdatedStatus());
		System.out.println("*******Thank You*******");
	}
	
	public static void  updateData() {
		System.out.println("Press 1 for update Product Id\nPress 2 for Update product Name\nPress 3 for Update Produc Price\nPress 4 for Update Stock");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Updaate the product Id : ");
			sh.setProductId(sc.nextInt());
			System.out.println("ID Updated at : "+LocalDateTime.now());
			sh.setUpdatedStatus("Id is recently Updated");
			break;
		case 2: 
			System.out.println("update the product name : ");
			sh.setName(sc.next());
			System.out.println("Name Updated at : "+LocalDateTime.now());
			sh.setUpdatedStatus("Name is Recently Updated ");
			break;
		case 3: 
			System.out.println("update the product price: ");
			double price = sc.nextDouble();
			sh.setPrice(price);
			double pricewithGST = price * 1.18;
			sh.setPricewithGST(pricewithGST);
			System.out.println("Price Updated at : "+LocalDateTime.now());
			sh.setUpdatedStatus("price is recently updated");
			break;
		case 4: 
			System.out.println("Update Stock :");
			sh.setStock(sc.nextInt());
			System.out.println("Stock updated at :"+LocalDateTime.now());
			sh.setUpdatedStatus("Stock is recently updated");
			break;
		}
	}
	
}
