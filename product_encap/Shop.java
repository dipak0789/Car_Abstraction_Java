package com.product_encap;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Shop {
private int productId;
private String name;
private static double price;
private LocalTime time;
private String UpdatedStatus;
private double PricewithGST;
private static int stock;
//for productId
public void setProductId(int productId) {
	this.productId = productId;
}

public int getProductId() {
	return productId;
}

//for name
public void setName(String name) {
	this.name =name;
}

public String getName() {
	return name;
}

//for price
public void setPrice(double price) {
	this.price = price;
}

public static double getPrice() {
	return price;
}
//for Time
public void setTime(LocalTime time) {
	this.time =time;
}
public LocalTime getTime() {
	return time;
}

//for Updated Status
public void setUpdatedStatus(String status) {
	this.UpdatedStatus = status;
}
public String getUpdatedStatus() {
	return UpdatedStatus;
}

// For PricewithGST
public void setPricewithGST(double GST) {
	this.PricewithGST =GST;
}
public double getPricewithGST() {
	return PricewithGST;
}
//for stock
public void setStock(int stock) {
	this.stock=stock;
}
public static int getStock() {
	return stock;
}
}
