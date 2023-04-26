package com.example.snehaluserservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.snehaluserservice.model.Customer;
import com.example.snehaluserservice.model.TransactionDto;

@Repository
public interface CustomeDao extends JpaRepository<Customer,String> {
	
	@Query("select c from customer c where c.customer_number=?1")
	public Customer insertCustomer(Customer customer);

}
