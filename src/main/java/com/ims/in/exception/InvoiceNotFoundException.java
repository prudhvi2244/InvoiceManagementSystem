package com.ims.in.exception;

public class InvoiceNotFoundException extends RuntimeException{
	
	public InvoiceNotFoundException() {
		super();
	}
	
	public InvoiceNotFoundException(String msg) {
		super(msg);
	}

}
