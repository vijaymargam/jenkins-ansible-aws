package com.oms.product.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.product.domain.Product;
import com.oms.product.exception.ProductNotFoundException;
import com.oms.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping("/get/{productId}")
	public Product findProductrById(@PathVariable int productId) {
		Product product = productService.findProductrById(productId);
		if (product == null) {
			throw new ProductNotFoundException("Not valid Product");
		}
		return product;
	}

}
