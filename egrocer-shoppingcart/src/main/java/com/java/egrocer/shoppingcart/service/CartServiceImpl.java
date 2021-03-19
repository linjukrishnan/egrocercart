package com.java.egrocer.shoppingcart.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.egrocer.shoppingcart.model.Cart;
import com.java.egrocer.shoppingcart.model.CartDetails;
import com.java.egrocer.shoppingcart.model.CartEntity;
import com.java.egrocer.shoppingcart.repository.CartDao;
import com.java.egrocer.shoppingcart.repository.CartProductDao;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDAO;
	
	@Autowired
	private CartProductDao cartProductDao;
	
	@Override
	public Cart addToCart(Cart productToCart) {
		
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		BeanUtils.copyProperties(productToCart, cartEntity);
		CartEntity entity=cartDAO.save(cartEntity);
		BeanUtils.copyProperties(entity, cart);
		return cart;
	}

	@Override
	public List<CartDetails> getAllCartDetails(long customerId) {
		List<CartDetails> cartProductList = cartProductDao.getAllCartDetails(customerId);
		return cartProductList;
	}

	@Override
	public String deleteFromCart(Cart cartProduct) {
		
		cartDAO.deleteById(cartProduct.getCartId());
		return "Product deleted from cart successfully";
	}

}
