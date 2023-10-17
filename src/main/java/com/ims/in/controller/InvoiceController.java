package com.ims.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ims.in.service.InvoiceService;

@Controller
@RequestMapping(value = "/invoice")
public class InvoiceController {
	
	
	private InvoiceService invoiceService;
	
	@Autowired
	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}
	
	@GetMapping(value = "/")
	public String showPage() {
		return "home";
	}
	

}
