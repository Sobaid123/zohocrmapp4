package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillingRpository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRpository billingRepo;


	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
		
	}


	@Override
	public List<Billing> getAllBills() {
		List<Billing> findAll = billingRepo.findAll();
		return findAll;
	}

}
