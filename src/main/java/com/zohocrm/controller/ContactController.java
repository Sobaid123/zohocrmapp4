package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contacts;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listcontacts")
    public String listContacts(Model model) {
        List<Contacts>  contacts = contactService.getAllContacts();
    	model.addAttribute("contacts", contacts);
    	return "list_contacts";
    }
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id, Model model) {
		Contacts contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@RequestMapping("/saveBill")
    public String saveBill(Billing bill, Model model) {
		billingService.generateBill(bill);
		List<Billing> allBill = billingService.getAllBills();
		model.addAttribute("allBill", allBill);
		return "list_bills";
   }

}
