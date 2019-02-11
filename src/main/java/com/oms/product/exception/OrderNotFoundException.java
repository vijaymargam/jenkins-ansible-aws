package com.oms.product.exception;

public class OrderNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4919916648420407838L;
	
	public OrderNotFoundException(String message) {
        super(message);
    }

}
