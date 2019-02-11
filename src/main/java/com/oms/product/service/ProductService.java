package com.oms.product.service;

import java.util.Set;

import com.oms.product.domain.Product;

public interface ProductService {

	public Product findProductrById(int productId);

	public Set<Product> findAllProducts();

	public void createProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(int productId);

}
