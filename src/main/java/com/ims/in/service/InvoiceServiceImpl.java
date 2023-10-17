package com.ims.in.service;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.in.entity.Invoice;
import com.ims.in.exception.InvoiceNotFoundException;
import com.ims.in.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	public void setInvoiceRepository(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}
	
	@Override
	public Invoice saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceRepository.save(invoice);
	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	@Override
	public void deleteInvoice(Long id) {
		// TODO Auto-generated method stub
		invoiceRepository.deleteById(id);

	}

	@Override
	public Invoice getInvoice(Long id) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(id).orElseThrow(()->new InvoiceNotFoundException("Invoice with ID :"+id+" Not Found"));
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

}
