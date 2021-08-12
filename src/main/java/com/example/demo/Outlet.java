package com.example.demo;

public class Outlet {
	private String dbPointName;
	private String dbPointId;
	private String firstAddress;
	private String secondAddress;
	
	public String getDbPointName() {
		return dbPointName;
	}
	public void setDbPointName(String dbPointName) {
		this.dbPointName = dbPointName;
	}
	public String getDbPointId() {
		return dbPointId;
	}
	public void setDbPointId(String dbPointId) {
		this.dbPointId = dbPointId;
	}
	public String getFirstAddress() {
		return firstAddress;
	}
	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}
	public String getSecondAddress() {
		return secondAddress;
	}
	public void setSecondAddress(String secondAddress) {
		this.secondAddress = secondAddress;
	}
	@Override
	public String toString() {
		return "Outlet [dbPointName=" + dbPointName + ", dbPointId=" + dbPointId + ", firstAddress=" + firstAddress
				+ ", secondAddress=" + secondAddress + "]";
	}
	public Outlet(String dbPointName, String dbPointId, String firstAddress, String secondAddress) {
		super();
		this.dbPointName = dbPointName;
		this.dbPointId = dbPointId;
		this.firstAddress = firstAddress;
		this.secondAddress = secondAddress;
	}
	public Outlet() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
