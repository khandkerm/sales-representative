package com.example.demo;

public class UpdateDesignation {
	private String eName;
	private String eShortName;
	private String mobileNo;
	private String email;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteShortName() {
		return eShortName;
	}
	public void seteShortName(String eShortName) {
		this.eShortName = eShortName;
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
		return "UpdateDesignation [eName=" + eName + ", eShortName=" + eShortName + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}
	public UpdateDesignation(String eName, String eShortName, String mobileNo, String email) {
		super();
		this.eName = eName;
		this.eShortName = eShortName;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public UpdateDesignation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
