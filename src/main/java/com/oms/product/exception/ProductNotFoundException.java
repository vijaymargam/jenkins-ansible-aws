package com.oms.product.exception;

public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4481825850805402430L;

	public ProductNotFoundException(String message) {
        super(message);
    }
}
