package com.example.jasyptdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jasyptdemo.dto.AddCustomerDto;
import com.example.jasyptdemo.entity.Customer;
import com.example.jasyptdemo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody AddCustomerDto addCustomerDto) {
		return customerService.addCustomer(addCustomerDto);
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerById(@PathVariable("id") Long customerId) {
		return customerService.getCustomerById(customerId);
	}

//	@GetMapping("/getCustomer/{name}")
//	public Customer getCustomerByName(@PathVariable("name") String customerName) {
//		return customerService.getCustomerByName(customerName);
//	}

	@DeleteMapping("/removeCustomer/{id}")
	public String removeCustomerById(@PathVariable("id") Long customerId) {
		return customerService.removeCustomerById(customerId);
	}

//	@DeleteMapping("/removeCustomer/{name}")
//	public String removeCustomerByName(@PathVariable("name") String customerName) {
//		return customerService.removeCustomerByName(customerName);
//	}

}
