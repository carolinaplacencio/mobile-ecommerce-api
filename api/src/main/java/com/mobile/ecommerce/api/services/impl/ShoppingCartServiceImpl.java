package com.mobile.ecommerce.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.ecommerce.api.models.ShoppingCart;
import com.mobile.ecommerce.api.repositories.ShoppingCartRepository;
import com.mobile.ecommerce.api.services.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	ShoppingCartRepository shoppingCartRepository;
	
	@Override
	public long countShoppingCart() {
		return this.shoppingCartRepository.count();
	}

	@Override
	public void save(ShoppingCart shoppingCart) {
		this.shoppingCartRepository.save(shoppingCart);		
	}
}
