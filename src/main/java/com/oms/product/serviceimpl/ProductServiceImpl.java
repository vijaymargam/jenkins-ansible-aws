package com.oms.product.serviceimpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.product.domain.Product;
import com.oms.product.repository.ProductRepository;
import com.oms.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product findProductrById(int productId) {
		Product product = productRepository.getOne(productId);
		return product;
	}

	@Override
	public Set<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

}
