package com.example.snehaladminservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.snehaladminservice.model.Loan;

@Repository
public interface LoanDao extends JpaRepository<Loan,String>{
	@Query("select l from Loan l where l.customer_number=?2")
public List<Loan> showAllLoans();
}
