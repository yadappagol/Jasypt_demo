package com.example.jasyptdemo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jasyptdemo.dto.AddCustomerDto;
import com.example.jasyptdemo.entity.Customer;
import com.example.jasyptdemo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(AddCustomerDto addCustomerDto) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(addCustomerDto, customer);
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long customerId) {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> getCustomerByName(String customerName) {
		return customerRepository.findByCustomerName(customerName);
	}

	@Override
	public String removeCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
		return "Customer removed Successfully..";
	}

	@Override
	public String removeCustomerByName(String customerName) {
		List<Customer> customer = customerRepository.findByCustomerName(customerName);
		customerRepository.deleteAll(customer);
		return "Customer removed Successfully..";
	}

}
