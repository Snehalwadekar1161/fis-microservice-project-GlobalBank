package com.example.snehaladminservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {

	@Id
	String customer_number;
	int loan_amount;
	String branch_id;
	
public Loan(){
		
	}
	
	public Loan(String customer_number,int loan_amount ,String branch_id) {
		super();
		
		this.customer_number=customer_number;
		this.loan_amount=loan_amount;
		this.branch_id =branch_id;
	}

	public void setCustomer_number(String customer_number)
	{
		this.customer_number=customer_number;
	}
	public String getCustomer_number() {
	  return customer_number;
	}
	
	public void setLoan_amount(int loan_amount) {
		this.loan_amount=loan_amount;
	}
	
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id =branch_id;
	}
	
	public String getBranch_id() {
		return branch_id;
	}

}
