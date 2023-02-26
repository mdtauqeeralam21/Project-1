package com.revature.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Physician {
	
	@Id
	@GeneratedValue
	private Integer pId;
	@Column
	private String pName;
	@Column
	private String pExpertise;
	@Column
	private String email;
	@Column
	private Long contactNo;
	@Column
	private String Address;
	@Column
	private LocalDate localDate;
	
	public Physician() {
		super();
	}



	public Physician(Integer pId, String pName, String pExpertise, String email, Long contactNo, String address,
			LocalDate localDate) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pExpertise = pExpertise;
		this.email = email;
		this.contactNo = contactNo;
		Address = address;
		this.localDate = localDate;
	}



	public Integer getpId() {
		return pId;
	}



	public void setpId(Integer pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public String getpExpertise() {
		return pExpertise;
	}



	public void setpExpertise(String pExpertise) {
		this.pExpertise = pExpertise;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getContactNo() {
		return contactNo;
	}



	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public LocalDate getLocalDate() {
		return localDate;
	}



	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
	
	
	

}
