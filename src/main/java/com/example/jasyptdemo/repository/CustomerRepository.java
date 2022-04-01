package com.example.jasyptdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jasyptdemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByCustomerName(String name);

}
