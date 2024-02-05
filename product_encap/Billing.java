package com.product_encap;

import java.math.BigInteger;

public class Billing {
	private String customerName;
	private BigInteger contactNumber;
	private int quantityOfProduct;
	private double finalPrice;
	private double totalAmount;
	private double giveChange;
	
	//for Customer name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	//for contact number
	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}
	public BigInteger getContactNumber(){
		return contactNumber;
	}
	//for product quantity 
	public void setQuantityOfProduct(int quantityOfProduct) {
		this.quantityOfProduct =quantityOfProduct;
	}
	public int getQuantityOfProduct() {
		return quantityOfProduct;
	}
	//for final price
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	
	//For Total Amount
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	//for give change
	public void setGiveChange(double giveChange) {
		this.giveChange = giveChange;
	}
	public double getGiveChange() {
		return giveChange;
	}
}
