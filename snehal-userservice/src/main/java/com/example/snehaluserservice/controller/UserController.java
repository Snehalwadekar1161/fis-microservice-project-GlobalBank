package com.example.snehaluserservice.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.snehaluserservice.model.Customer;
import com.example.snehaluserservice.model.LoanDto;
import com.example.snehaluserservice.model.TransactionDto;
import com.example.snehaluserservice.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/applyForLoan")
	public LoanDto applyForLoan(LoanDto loan) {
		return service.applyForLoan(loan);
	}
	
	@GetMapping("/insertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
		
	}
	
	@GetMapping("/makeTransaction")
	public TransactionDto makeTransaction(@RequestBody TransactionDto transaction) {
		return service.makeTransaction(transaction);
	}
	
	@GetMapping("/transactionDetails")
	public List <TransactionDto> searchByAccountNumandDate(@PathVariable("account_number")String account_number,@PathVariable("date_of_transaction")Date date_of_transaction){
	return service.searchByAccountNumandDate(account_number, date_of_transaction);
	}
	
	@GetMapping("/transactionByDate")
	public List <TransactionDto> searchByDate(@PathVariable("date_of_transaction")Date date_of_transaction){
		return service.searchByDate(date_of_transaction);
	}
	
}
