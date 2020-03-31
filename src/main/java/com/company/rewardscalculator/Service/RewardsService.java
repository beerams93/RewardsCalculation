package com.company.rewardscalculator.Service;

import java.util.List;

import com.company.rewardscalculator.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(Integer customerId) {
		return customerRepo.findById(customerId).orElse(null);
	}

}
