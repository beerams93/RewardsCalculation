package com.company.rewardscalculator.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.rewardscalculator.Model.Customer;
import com.company.rewardscalculator.Model.MyTransaction;
import org.springframework.stereotype.Service;

@Service
public class RewardsServiceMock {

	private static List<MyTransaction> transactions = new ArrayList<MyTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new MyTransaction(index++, new Customer(1, "sai"), 100.0, "Purchase 1", new Date()) );
		transactions.add( new MyTransaction(index++, new Customer(2, "Bhavana"), 50.0, "Purchase 2", new Date()) );
		transactions.add( new MyTransaction(index++, new Customer(3, "karl"), 120.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<MyTransaction> getAll() {
		return transactions;
	}
	
}
