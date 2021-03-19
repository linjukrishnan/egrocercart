package com.java.egrocer.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartproduct")
public class CartProduct {
	
	@Id
	private long cartId;
	@Column
	private long productId;
	@Column
	private int quantity;
	@Column
	private long customerId; 
	@Column
	private String username;
	@Column
	private String productName;
	@Column
	private double productPrice;
	@Column
	private double productTotal;
	
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
