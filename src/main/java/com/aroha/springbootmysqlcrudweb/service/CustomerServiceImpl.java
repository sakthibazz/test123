package com.aroha.springbootmysqlcrudweb.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.aroha.springbootmysqlcrudweb.entity.Customer;
import com.aroha.springbootmysqlcrudweb.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer saveOrUpdateCustomer(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteCustomer(Long id) {
		 repository.deleteById(id);
		
	}


}
