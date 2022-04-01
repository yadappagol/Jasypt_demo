package com.example.jasyptdemo.service;

import java.util.List;

import com.example.jasyptdemo.dto.AddCustomerDto;
import com.example.jasyptdemo.entity.Customer;

public interface CustomerService {

	Customer addCustomer(AddCustomerDto addCustomerDto);

	List<Customer> getAllCustomers();

	Customer getCustomerById(Long customerId);

	List<Customer> getCustomerByName(String customerName);

	String removeCustomerById(Long customerId);

	String removeCustomerByName(String customerName);

}
