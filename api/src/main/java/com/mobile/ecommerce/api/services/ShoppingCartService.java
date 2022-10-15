package com.mobile.ecommerce.api.services;

import com.mobile.ecommerce.api.models.ShoppingCart;

public interface ShoppingCartService {
	public void save(ShoppingCart shoppingCart);
	
	public long countShoppingCart();
}
