package com.acme.acmeproductmanagement.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acme.acmeproductmanagement.beans.Product;

@Service
public class ProductUtils {

	public List<Product> getAllHardcodedProductsList() {

		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1L, "Leaf Rake", "GDN-0011", "March 19, 2019",
				"Leaf rake with 48-inch wooden handle.", 19.95, 3.2, "./assets/images/leaf_rake.png"));
		productList.add(new Product(2L, "Garden Cart", "GDN-0023", "March 18, 2019",
				"15 gallon capacity rolling garden cart", 32.99, 4.2, "./assets/images/garden_cart.png"));
		productList.add(new Product(5L, "Hammer", "TBX-0048", "May 21, 2019", "Curved claw steel hammer", 8.9, 4.8,
				"./assets/images/hammer.png"));
		productList.add(new Product(8L, "Saw", "TBX-0022", "May 15, 2019", "15-inch steel blade hand saw", 11.55, 3.7,
				"./assets/images/saw.png"));
		productList.add(new Product(10L, "Video Game Controller", "GMG-0042", "October 15, 2018",
				"Standard two-button video game controller", 35.95, 4.6, "./assets/images/xbox-controller.png"));

		return productList;
	}

}
