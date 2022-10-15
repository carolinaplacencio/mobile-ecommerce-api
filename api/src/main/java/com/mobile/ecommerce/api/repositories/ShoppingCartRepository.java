package com.mobile.ecommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.ecommerce.api.models.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
