package com.ims.in.service;

import java.util.List;

import com.ims.in.entity.Invoice;

public interface InvoiceService {
	
	Invoice saveInvoice(Invoice invoice);
	List<Invoice> getAllInvoices();
	void deleteInvoice(Long id);
	Invoice getInvoice(Long id);
	Invoice updateInvoice(Invoice invoice);

}
