package com.acme.acmeproductmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.acmeproductmanagement.beans.Product;
import com.acme.acmeproductmanagement.service.ProductService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="/acme/products")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(path="/getHardcodedProducts")
	public ResponseEntity<List<Product>> getHardcodedProducts() {
		List<Product> hardcodedProductList = productService.getAllHardcodedProducts();
		return new ResponseEntity<List<Product>>(hardcodedProductList, HttpStatus.OK);
	} 
}
