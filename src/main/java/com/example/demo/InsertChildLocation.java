package com.example.demo;

public class InsertChildLocation {
	private String dbPointTypeCode;
	private int parentDbPointId;
	private String dbPointDescr;
	private String status;
	public String getDbPointTypeCode() {
		return dbPointTypeCode;
	}
	public void setDbPointTypeCode(String dbPointTypeCode) {
		this.dbPointTypeCode = dbPointTypeCode;
	}
	public int getParentDbPointId() {
		return parentDbPointId;
	}
	public void setParentDbPointId(int parentDbPointId) {
		this.parentDbPointId = parentDbPointId;
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
		return "InsertChildLocation [dbPointTypeCode=" + dbPointTypeCode + ", parentDbPointId=" + parentDbPointId
				+ ", dbPointDescr=" + dbPointDescr + ", status=" + status + "]";
	}
	public InsertChildLocation(String dbPointTypeCode, int parentDbPointId, String dbPointDescr, String status) {
		super();
		this.dbPointTypeCode = dbPointTypeCode;
		this.parentDbPointId = parentDbPointId;
		this.dbPointDescr = dbPointDescr;
		this.status = status;
	}
	public InsertChildLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
