package com.java.egrocer.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.egrocer.shoppingcart.model.CartEntity;

@Repository
public interface CartDao extends JpaRepository<CartEntity, Long> {
	
}