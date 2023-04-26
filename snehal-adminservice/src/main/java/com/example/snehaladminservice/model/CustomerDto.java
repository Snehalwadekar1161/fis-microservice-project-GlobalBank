package com.example.snehaladminservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerDto {
	
	@Id
	String customer_number;
	String FIRSTNAME;
	String  middlename; 
	String lastname ;
	String CUSTOMER_CITY;
	int CUSTOMER_CONTACT_NO ;
	String occupation ;
	LocalDate CUSTOMER_DATE_OF_BIRTH;
	
	
	
	public CustomerDto()
	{
	
	}
	public CustomerDto(String customer_number,String FIRSTNAME ,String  middlename,String lastname,String CUSTOMER_CITY,int CUSTOMER_CONTACT_NO,String occupation,LocalDate CUSTOMER_DATE_OF_BIRTH ) {
		super();
		this.CUSTOMER_CITY=CUSTOMER_CITY;
		this.customer_number=customer_number;
		this.CUSTOMER_CONTACT_NO=CUSTOMER_CONTACT_NO;
		this.FIRSTNAME=FIRSTNAME;
		this.middlename=middlename;
		this.lastname=lastname;
		this.occupation=occupation;
		this.CUSTOMER_DATE_OF_BIRTH=CUSTOMER_DATE_OF_BIRTH;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCUSTOMER_CITY() {
		return CUSTOMER_CITY;
	}
	public void setCUSTOMER_CITY(String cUSTOMER_CITY) {
		CUSTOMER_CITY = cUSTOMER_CITY;
	}
	public int getCUSTOMER_CONTACT_NO() {
		return CUSTOMER_CONTACT_NO;
	}
	public void setCUSTOMER_CONTACT_NO(int cUSTOMER_CONTACT_NO) {
		CUSTOMER_CONTACT_NO = cUSTOMER_CONTACT_NO;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public LocalDate getCUSTOMER_DATE_OF_BIRTH() {
		return CUSTOMER_DATE_OF_BIRTH;
	}
	public void setCUSTOMER_DATE_OF_BIRTH(LocalDate cUSTOMER_DATE_OF_BIRTH) {
		CUSTOMER_DATE_OF_BIRTH = cUSTOMER_DATE_OF_BIRTH;
	}

}
