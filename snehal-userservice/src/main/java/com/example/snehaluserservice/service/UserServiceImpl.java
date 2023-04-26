package com.example.snehaluserservice.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Node;
import org.w3c.dom.UserDataHandler;

import com.example.snehaluserservice.model.Customer;
import com.example.snehaluserservice.model.LoanDto;
import com.example.snehaluserservice.model.TransactionDto;
import com.example.snehaluserservice.model.UserProxy;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	RestTemplate temp;
	
	@Autowired
	UserProxy uproxy;
	
	@Autowired
	Customer customerDao;
	
	
	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public LoanDto applyForLoan(LoanDto loan) {
		// TODO Auto-generated method stub
		return uproxy.applyLoan(loan);
	}

	@Override
	public TransactionDto makeTransaction(TransactionDto transaction) {
		// TODO Auto-generated method stub
		return uproxy.makeTransaction(transaction);
	}

	@Override
	public List<TransactionDto> searchByAccountNumandDate(String account_number, Date date_of_transaction) {
		// TODO Auto-generated method stub
		return uproxy.searchByAccountNumandDate(account_number, date_of_transaction);
	}

	@Override
	public List<TransactionDto> searchByDate(Date date_of_transaction) {
		// TODO Auto-generated method stub
		return uproxy.searchByDate(date_of_transaction);
	}

}
