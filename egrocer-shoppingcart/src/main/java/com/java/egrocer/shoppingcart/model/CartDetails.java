package com.java.egrocer.shoppingcart.model;

public class CartDetails {

	private long cartId;
	private long productId;
	private int quantity;
	private long customerId; 
	private String username;
	private String productName;
	private double productPrice;
	private double productTotal;
	
	public CartDetails(long cartId,long productId,int quantity,long customerId,
			String username,String productName,double productPrice,double productTotal) {
		this.cartId=cartId;
		this.productId=productId;
		this.quantity=quantity;
		this.customerId=customerId;
		this.username=username;
		this.productName=productName;
		this.productPrice=productPrice;
		this.productTotal=productTotal;
	}
	
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(double productTotal) {
		this.productTotal = productTotal;
	}
	
}
