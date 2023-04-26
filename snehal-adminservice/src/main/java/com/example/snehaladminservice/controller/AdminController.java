package com.example.snehaladminservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.snehaladminservice.model.Account;
import com.example.snehaladminservice.model.Branch;
import com.example.snehaladminservice.model.CustomerDto;
import com.example.snehaladminservice.model.Loan;
import com.example.snehaladminservice.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/admin")

public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/allLoans")
	public List<Loan> showAllLoans()
	{
		return service.getAllLoans();
	}
	
	@GetMapping("/allaccounts")
	public List<Account> getAllAccounts(){
		return service.getAllAccounts();
	}
	
	@GetMapping("/allbranchs")
	public List<Branch> getAllBranches(){
		return service.getAllBranches();
	}
	
	@DeleteMapping("/delete/{branch_id}")
	public String deletebranch(@PathVariable("branch_id")String branch_id) {
		service.deleteBranch(branch_id);
		return "branch deleted";
		}
	
	@DeleteMapping("/delete/{account_number}")
	public String deleteAccount(@PathVariable("account_number")String account_number) {
		service.deleteAccount(account_number);
		return "account deleted";
	}
	
	@PostMapping("/addBranch")
	public Branch insertBranch(@RequestBody Branch branch) {
	 return service.insertBranch(branch);
	}
	
	@PostMapping("/addAccount")
	public Account insertAccount(@RequestBody  Account account) {
		return service.insertAccount(account);
	
	}
	
	@GetMapping("/allCustomers")
	public List<CustomerDto> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/findCustomerByCustomer_number")
	public List<CustomerDto> findCustomerByCustomer_number(@PathVariable("customer_number")String customer_number){
		return service.findCustomerByCustomer_number(customer_number);
	}
	
}
