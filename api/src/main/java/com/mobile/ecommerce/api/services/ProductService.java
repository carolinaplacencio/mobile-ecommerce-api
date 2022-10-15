package com.mobile.ecommerce.api.services;

import java.util.List;
import java.util.Optional;

import com.mobile.ecommerce.api.models.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Optional<Product> findById(Long id);

}
