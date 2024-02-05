package com.product_encap;
import java.util.*;
public class Operations_Billing {
	static Scanner sc = new Scanner(System.in);
	static Billing bl = new Billing();
	
	public static void setData() {
		System.out.println("Enter Customer Name : ");
		bl.setCustomerName(sc.next());
		System.out.println("Enter Contact number : ");
		bl.setContactNumber(sc.nextBigInteger());
		System.out.println("Enter Quantity Of Product : ");
		int quantity = sc.nextInt();
		bl.setQuantityOfProduct(quantity);
		if (Shop.getStock()< quantity){
			System.out.println("Out Of Stock...");
		}else {
		System.out.println("Enter Total Amount in Wallet :");
		double totalAmount = sc.nextDouble();
		bl.setTotalAmount(totalAmount);
		double finalPrice = Shop.getPrice() * quantity;
		bl.setFinalPrice(finalPrice);
		double giveChange = totalAmount - finalPrice;
		bl.setGiveChange(giveChange);
		}
	}
	
	public static void getData() {
		System.out.println("Customer Name is : "+bl.getCustomerName());
		System.out.println("Conatact Number is: "+bl.getContactNumber());
		System.out.println("Quantity of Product is: "+bl.getQuantityOfProduct());
		System.out.println("Total Amount is: "+bl.getTotalAmount());
		System.out.println("Final Price is: "+ bl.getFinalPrice());
		System.out.println("Give change : "+bl.getGiveChange());
		
	}
	public void checkData() {
		
	}
}
