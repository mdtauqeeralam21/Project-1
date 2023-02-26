package com.revature.bindings;

import java.time.LocalDate;

public class PhysicianForm {       //DTO
	private Integer pId;
	private String pName;
	private String pExpertise;
	private String email;
	private Long contactNo;
	private String Address;
	private LocalDate localDate;
	
	
	public PhysicianForm() {
		super();
	}


	public PhysicianForm(Integer pId, String pName, String pExpertise, String email, Long contactNo, String address,
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
