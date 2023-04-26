package com.example.snehaladminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.snehaladminservice.Dao.AccountDao;
import com.example.snehaladminservice.Dao.BranchDao;
import com.example.snehaladminservice.Dao.LoanDao;
import com.example.snehaladminservice.model.Account;
import com.example.snehaladminservice.model.Branch;
import com.example.snehaladminservice.model.CustomerDto;
import com.example.snehaladminservice.model.CustomerProxy;
import com.example.snehaladminservice.model.Loan;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	RestTemplate temp;
	@Autowired
	CustomerProxy cproxy;
	
	@Autowired
	AccountDao accountDao;
	@Autowired
	LoanDao loanDao;
	@Autowired
	BranchDao branchDao;
	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

	@Override
	public void deleteBranch(String Branch_id) {
		// TODO Auto-generated method stub
		branchDao.deleteBranch(Branch_id);
		//return "deleted ";
	
	}
	public void deleteAccount(String account_number)
	{
		accountDao.deleteById(account_number);
	//	return"account is delete succesfully";
	}

	@Override
	public Branch insertBranch(Branch branch) {
		// TODO Auto-generated method stub
		return branchDao.save(branch);
	}

	@Override
	public Account insertAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.save(account);
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		// TODO Auto-generated method stub
		return cproxy.getAllCustomers();
	}

	@Override
	public List<Branch> getAllBranches() {
		// TODO Auto-generated method stub
		return branchDao.findAll();
	}

	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}

	@Override
	public List<CustomerDto> findCustomerByCustomer_number(String customer_number) {
		// TODO Auto-generated method stub
		return cproxy.findCustomerByCustomer_number(customer_number);
	}

}
