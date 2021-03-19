package com.java.egrocer.shoppingcart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.egrocer.shoppingcart.model.Cart;
import com.java.egrocer.shoppingcart.model.CartDetails;
import com.java.egrocer.shoppingcart.model.GrocerProducts;
import com.java.egrocer.shoppingcart.service.CartService;


@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;

	@RequestMapping(method = RequestMethod.POST, value = "/addToCart")
	public String addToCart(@RequestBody Cart request)
	{
		Cart productToCart = (Cart)request;
		Cart updateProduct = cartService.addToCart(productToCart);
		if(updateProduct.getCartId() != 0) {
			return "Product added to cart successfully";
		}
		return "Adding product to cart failed";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAllCartDetails/{customerId}")
	public GrocerProducts getAllCartDetails(@PathVariable(value="customerId") long customerId)
	{
		
		System.out.println("entered");
		GrocerProducts gproducts = new GrocerProducts();
		try {
			List<CartDetails> cartProductList = cartService.getAllCartDetails(customerId);
			gproducts.getGrocerProductMap().put("cartProductList", cartProductList);
			double totalProductAmount=0.0d;
			for (CartDetails cartProduct : cartProductList) {
				totalProductAmount=totalProductAmount+cartProduct.getProductTotal();
			}
			gproducts.getGrocerProductMap().put("totalProductAmount", totalProductAmount);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return gproducts;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteFromCart")
	public String deleteFromCart(@RequestBody Cart request)
	{
		Cart cartProduct = (Cart)request;
		String message = cartService.deleteFromCart(cartProduct);
		return message;
	}
}
