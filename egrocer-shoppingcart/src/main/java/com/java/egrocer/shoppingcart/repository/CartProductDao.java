package com.java.egrocer.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.egrocer.shoppingcart.model.CartDetails;
import com.java.egrocer.shoppingcart.model.CartEntity;

@Repository
public interface CartProductDao extends JpaRepository<CartEntity, Long> {
	
	@Query(name="CartProductDao.getAllCartDetails")
	public List<CartDetails> getAllCartDetails(long customerId);
}