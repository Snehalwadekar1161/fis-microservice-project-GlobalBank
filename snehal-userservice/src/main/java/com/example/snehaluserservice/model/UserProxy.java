package com.example.snehaluserservice.model;

import java.sql.Date;
import java.util.*;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@Repository
@Service
@FeignClient("USER-SERVICE/Loan/Transaction")
public interface UserProxy{
	
	@GetMapping("/addCustomer")
	public Customer addCustomer(Customer customer);
	
	@GetMapping("/applyloan")
	public LoanDto applyLoan(@RequestBody LoanDto loan);
	
	@PostMapping("/makeTransaction")
	public TransactionDto makeTransaction(TransactionDto transactionDto);
	
	@GetMapping("/searchByAccountNumDate/{account_number}/{/date_of_transaction}")
	public List <TransactionDto> searchByAccountNumandDate(@PathVariable("account_number") String account_number,@PathVariable("date_of_transaction") Date date_of_transaction);
	
	@GetMapping("/searchByDate/{date_of_transaction}")
	public List <TransactionDto> searchByDate(@PathVariable("date_of_transaction") Date date_of_transaction);
}