/*package com.example.snehaladminservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.snehaladminservice.model.CustomerDto;

@Repository
public interface CustomerDao extends JpaRepository<CustomerDto,String> {

	
	@Query("select c from Customer c where c.customer_number=?2")
	//public List<Customer> showAllCustomers();
	public void deleteCustomer(String customer_id);
	//public String deleteCustomer(String customer_number);
	
}
*/