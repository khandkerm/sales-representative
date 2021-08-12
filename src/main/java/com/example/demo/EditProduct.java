package com.example.demo;

public class EditProduct {
	private String proCode;
	private String proDescr;
	private String status;
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProDescr() {
		return proDescr;
	}
	public void setProDescr(String proDescr) {
		this.proDescr = proDescr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EditProduct [proCode=" + proCode + ", proDescr=" + proDescr + ", status=" + status + "]";
	}
	public EditProduct(String proCode, String proDescr, String status) {
		super();
		this.proCode = proCode;
		this.proDescr = proDescr;
		this.status = status;
	}
	public EditProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
