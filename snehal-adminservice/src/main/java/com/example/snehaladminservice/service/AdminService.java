package com.example.snehaladminservice.service;

import java.util.*;
import com.example.snehaladminservice.model.*;

public interface AdminService {
	
	public List<Account> getAllAccounts();
	public Branch insertBranch(Branch branch);
	public Account insertAccount(Account account);
	public List<CustomerDto> getAllCustomers();
	public List<Branch> getAllBranches();
	public List<Loan> getAllLoans();
	//public void deleteCustomer(String customer_number);
	public void deleteAccount(String account_number);
	public void deleteBranch(String branch_id);
	public List<CustomerDto> findCustomerByCustomer_number(String customer_number);
	

}
