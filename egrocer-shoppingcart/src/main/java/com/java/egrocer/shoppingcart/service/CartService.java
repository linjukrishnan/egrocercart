package com.java.egrocer.shoppingcart.service;

import java.util.List;

import com.java.egrocer.shoppingcart.model.Cart;
import com.java.egrocer.shoppingcart.model.CartDetails;

public interface CartService {

	public Cart addToCart(Cart productToCart);
	public List<CartDetails> getAllCartDetails(long customerId);
	public String deleteFromCart(Cart cartProduct);
}
