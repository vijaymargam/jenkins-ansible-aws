package com.oms.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oms.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
