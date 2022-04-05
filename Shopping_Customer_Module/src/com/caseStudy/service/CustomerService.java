package com.caseStudy.service;

import java.util.List;

import com.caseStudy.entities.Customer;

public interface CustomerService {
	
	
	public Customer searchItem(String itemName);
	
	public Customer orderItem(Customer customer);
	
	public Customer searchMall(int id);
	
	public Customer cancelOrder(int orderid);
	
	
	
	
	

}
