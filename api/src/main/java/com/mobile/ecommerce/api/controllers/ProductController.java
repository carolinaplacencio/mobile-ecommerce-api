package com.mobile.ecommerce.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.ecommerce.api.models.Product;
import com.mobile.ecommerce.api.models.ShoppingCart;
import com.mobile.ecommerce.api.services.ProductService;
import com.mobile.ecommerce.api.services.ShoppingCartService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

	
@RestController
@RequestMapping(value="/api")
@Api(value="API Products")
@CrossOrigin(origins = "*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@GetMapping("/products")
	@ApiOperation(value="Returns a list of products")
	public ResponseEntity<List<Product>> getProductList(){
		List<Product> products = this.productService.findAll();	    
	    return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
 	@ApiOperation(value="Return the product that has the requested id")
	public ResponseEntity<Product> getProductById(@PathVariable(value="id") String id){	
		Optional<Product> products = productService.findById(Long.parseLong(id));
	    if(products.isPresent()){
	        Product product = products.get();
	        return new ResponseEntity<>(product, HttpStatus.OK);
	    }
	    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
		
	@PostMapping("/cart")
	@ApiOperation(value="Save and returns the number of items in the cart")
	public ResponseEntity<Long> countCart(ShoppingCart shoppingCart){
		this.shoppingCartService.save(shoppingCart);    
	    return new ResponseEntity<>(shoppingCartService.countShoppingCart(), HttpStatus.OK);
    }

}
