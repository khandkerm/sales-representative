package com.example.demo;

public class InsertParentLocation {
	private String dbPointTypeCode;
	private String dbPointDescr;
	private String status;
	public String getDbPointTypeCode() {
		return dbPointTypeCode;
	}
	public void setDbPointTypeCode(String dbPointTypeCode) {
		this.dbPointTypeCode = dbPointTypeCode;
	}
	public String getDbPointDescr() {
		return dbPointDescr;
	}
	public void setDbPointDescr(String dbPointDescr) {
		this.dbPointDescr = dbPointDescr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InsertParentLocation [dbPointTypeCode=" + dbPointTypeCode + ", dbPointDescr=" + dbPointDescr
				+ ", status=" + status + "]";
	}
	public InsertParentLocation(String dbPointTypeCode, String dbPointDescr, String status) {
		super();
		this.dbPointTypeCode = dbPointTypeCode;
		this.dbPointDescr = dbPointDescr;
		this.status = status;
	}
	public InsertParentLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
