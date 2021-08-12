package com.example.demo;

public class InsertDesignation {
	private String empName;
	private String desigCode;
	private String status;
	private String shortName;
	private String parentEmpId;
	private String phoneNumber;
	private String email;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesigCode() {
		return desigCode;
	}
	public void setDesigCode(String desigCode) {
		this.desigCode = desigCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getParentEmpId() {
		return parentEmpId;
	}
	public void setParentEmpId(String parentEmpId) {
		this.parentEmpId = parentEmpId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "InsertDesignation [empName=" + empName + ", desigCode=" + desigCode + ", status=" + status
				+ ", shortName=" + shortName + ", parentEmpId=" + parentEmpId + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	public InsertDesignation(String empName, String desigCode, String status, String shortName, String parentEmpId,
			String phoneNumber, String email) {
		super();
		this.empName = empName;
		this.desigCode = desigCode;
		this.status = status;
		this.shortName = shortName;
		this.parentEmpId = parentEmpId;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public InsertDesignation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
