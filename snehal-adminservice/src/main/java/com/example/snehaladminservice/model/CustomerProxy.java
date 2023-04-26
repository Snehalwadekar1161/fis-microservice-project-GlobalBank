package com.example.snehaladminservice.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@Repository
@Service
@FeignClient("USER-SERVICE/customer")
public interface CustomerProxy {
	

	@GetMapping("/allCustomers")
	public List<CustomerDto> getAllCustomers();
	
	@GetMapping("/findCustomerByCustomer_number")
	public List<CustomerDto> findCustomerByCustomer_number(@PathVariable("customer_number")String customer_number);
}