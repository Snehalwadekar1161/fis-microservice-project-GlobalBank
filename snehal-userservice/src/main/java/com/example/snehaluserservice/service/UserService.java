package com.example.snehaluserservice.service;

import java.util.*;
import java.sql.Date;


import com.example.snehaluserservice.model.Customer;
import com.example.snehaluserservice.model.LoanDto;
import com.example.snehaluserservice.model.TransactionDto;


public interface UserService {
	
	public LoanDto  applyForLoan(LoanDto loan);
	public TransactionDto makeTransaction(TransactionDto transaction);
	public List <TransactionDto> searchByAccountNumandDate(String account_number,Date date_of_transaction);
	public List <TransactionDto> searchByDate(Date date_of_transaction);
	public Customer insertCustomer(Customer customer);
	
}
