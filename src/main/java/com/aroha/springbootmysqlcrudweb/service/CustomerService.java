package com.aroha.springbootmysqlcrudweb.service;

import java.util.List;
import java.util.Optional;

import com.aroha.springbootmysqlcrudweb.entity.Customer;



public interface CustomerService {
	public Customer saveOrUpdateCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Optional<Customer> getCustomerById(Long id);
	public void deleteCustomer(Long id) ;

}
