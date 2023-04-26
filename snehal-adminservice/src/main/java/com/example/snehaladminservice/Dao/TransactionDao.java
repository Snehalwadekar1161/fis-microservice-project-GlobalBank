package com.example.snehaladminservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.snehaladminservice.model.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction,String>
{
	
	//@Query("select t from Transaction t where t.transaction_number=?1")
	//public List<Transaction> findBytransaction_number(String transaction_number);
}