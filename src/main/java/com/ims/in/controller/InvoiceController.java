package com.ims.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ims.in.entity.Invoice;
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
	
	@GetMapping(value = "/register")
	public ModelAndView showRegisterPage() {
		ModelAndView mav=new ModelAndView("registration");
		mav.addObject("msg","Welcome to Invoice Management System!!");
		return mav;
	}
	
	
	@PostMapping(value = "/register")
	public ModelAndView saveInvoiceDetails(@ModelAttribute Invoice invoice) {
		Invoice savedInvoice=invoiceService.saveInvoice(invoice);
		ModelAndView mav=new ModelAndView("registration");
		mav.addObject("sm","Invoice with ID:"+savedInvoice.getId()+" Saved Successfully!");
		return mav;
	}
	
	@GetMapping(value = "/allInvoices")
	public ModelAndView getAllInvoices() {
		List<Invoice> allInvoices=invoiceService.getAllInvoices();
		ModelAndView mav=new ModelAndView("allInvoices");
		mav.addObject("allInvoices", allInvoices);
		return mav;
	}
	

}
