package com.caseStudy.service;

import java.util.List;

import com.caseStudy.entities.Customer;
import com.caseStudy.repository.CustomerRepository;
import com.caseStudy.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	// Establishing connection b/w repo and service
	private CustomerRepository dao;
	
	
	
	public CustomerServiceImpl() {
		dao = new CustomerRepositoryImpl();
	}



	@Override
	public Customer searchItem(String itemName) {
		dao.beginTransaction();
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Customer orderItem(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Customer searchMall(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Customer cancelOrder(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}
}

	

	