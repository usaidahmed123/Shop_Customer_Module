package com.caseStudy.repository;

import javax.persistence.EntityManager;

import com.caseStudy.entities.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	
	
	
	//Step 1 : Start JPA Life Cycle
	private EntityManager entityManager;
	
	
	public CustomerRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		entityManager.persist(customer);
		
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		entityManager.merge(customer);
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public boolean deleteCustomer(int id) {
		
		Customer customer = entityManager.find(Customer.class,id);
		entityManager.remove(customer);
		
		return false;
	}

	@Override
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

}
