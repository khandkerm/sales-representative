package com.example.demo;

public class EditEmployee {
	private String empName;
	private String status;
	private String shortName;
	private String mobileNo;
	private String email;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EditEmployee [empName=" + empName + ", status=" + status + ", shortName=" + shortName + ", mobileNo="
				+ mobileNo + ", email=" + email + "]";
	}
	public EditEmployee(String empName, String status, String shortName, String mobileNo, String email) {
		super();
		this.empName = empName;
		this.status = status;
		this.shortName = shortName;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public EditEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
