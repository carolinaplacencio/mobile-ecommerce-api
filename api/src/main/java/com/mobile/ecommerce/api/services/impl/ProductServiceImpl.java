package com.mobile.ecommerce.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.ecommerce.api.models.Product;
import com.mobile.ecommerce.api.repositories.ProductRepository;
import com.mobile.ecommerce.api.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {  
		return productRepository.findById(id);
	}

}
