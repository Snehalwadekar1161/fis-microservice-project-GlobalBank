package com.example.snehaladminservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.snehaladminservice.model.Account;
@Repository
public interface AccountDao extends JpaRepository<Account ,String>
{
	@Query("select a from Account a where a.account_number=?2 ")
	public void deleteAccount(String account_number);
	//public List<Account> insertAccount(String account_number);
	public List<Account> findByAccount_number(String account_number);
		//public List<Account> showAll();
		
		
		//@Query("select a from Account a where a.account_number=?2 ")
		//public List<Account> showAll();
	}
