package com.aroha.springbootmysqlcrudweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aroha.springbootmysqlcrudweb.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
