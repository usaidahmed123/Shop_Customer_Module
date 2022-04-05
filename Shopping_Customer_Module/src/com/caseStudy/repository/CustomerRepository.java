package com.caseStudy.repository;

import com.caseStudy.entities.Customer;

public interface CustomerRepository {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer searchCustomer(int id);
	public boolean deleteCustomer(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	
}
