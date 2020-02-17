package com.acme.acmeproductmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.acmeproductmanagement.beans.Product;
import com.acme.acmeproductmanagement.service.ProductService;
import com.acme.acmeproductmanagement.utility.ProductUtils;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductUtils productUtils;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllHardcodedProducts() {
		
		return productUtils.getAllHardcodedProductsList();
	}

}
