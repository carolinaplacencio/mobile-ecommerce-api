package com.mobile.ecommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mobile.ecommerce.api.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
