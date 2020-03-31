package com.company.rewardscalculator.Controller;

import java.util.List;

import com.company.rewardscalculator.Service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.rewardscalculator.Model.Customer;

@RestController
public class RewardsController {

	
	@Autowired
	private RewardsService rewardsService;
	

	
	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return rewardsService.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
}
