package com.acme.acmeproductmanagement.service;

import java.util.List;

import com.acme.acmeproductmanagement.beans.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public List<Product> getAllHardcodedProducts();
	
}
