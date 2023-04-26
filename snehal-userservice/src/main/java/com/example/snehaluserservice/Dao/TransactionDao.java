package com.example.snehaluserservice.Dao;

import java.sql.Date;
import java.util.List;

import com.example.snehaluserservice.model.TransactionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDao extends JpaRepository<TransactionDto,String>
{
	
	@Query("select t from transaction t where t.transaction_number=?1 and t.date_of_transaction=?2")
	public TransactionDto makeTransaction(TransactionDto transactionDto);
	public List <TransactionDto> searchByAccountNumandDate(String account_number,Date date_of_transaction);
	public List <TransactionDto> searchByDate(Date date_of_transaction);
	

}
