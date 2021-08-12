package com.example.demo;

public class Store_emp {
	private String EMP_NAME;
	private int EMP_ID;
	public Store_emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store_emp(String eMP_NAME, int eMP_ID) {
		super();
		EMP_NAME = eMP_NAME;
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	@Override
	public String toString() {
		return "Store_emp [EMP_NAME=" + EMP_NAME + ", EMP_ID=" + EMP_ID + "]";
	}
	
	
}
