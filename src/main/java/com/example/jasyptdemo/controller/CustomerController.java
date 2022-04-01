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

	/**
	 * @param addCustomerDto
	 * @return URL : http://localhost:8085/customer/addCustomer
	 */
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody AddCustomerDto addCustomerDto) {
		return customerService.addCustomer(addCustomerDto);
	}

	/**
	 * URL : http://localhost:8085/customer/getAllCustomers
	 */
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	/**
	 * URL : http://localhost:8085/customer/getCustomerById/{id}
	 */
	@GetMapping("/getCustomerById/{id}")
	public Customer getCustomerById(@PathVariable("id") Long customerId) {
		return customerService.getCustomerById(customerId);
	}

	/**
	 * URL : http://localhost:8085/customer/removeCustomerById/{id}
	 */
	@DeleteMapping("/removeCustomerById/{id}")
	public String removeCustomerById(@PathVariable("id") Long customerId) {
		return customerService.removeCustomerById(customerId);
	}

	/**
	 * URL : http://localhost:8085/customer/getCustomerByName/{name}
	 */
	@GetMapping("/getCustomerByName/{name}")
	public List<Customer> getCustomerByName(@PathVariable("name") String customerName) {
		return customerService.getCustomerByName(customerName);
	}

	/**
	 * URL : http://localhost:8085/customer/removeCustomerByName/{name}
	 */
	@DeleteMapping("/removeCustomerByName/{name}")
	public String removeCustomerByName(@PathVariable("name") String customerName) {
		return customerService.removeCustomerByName(customerName);
	}

}
