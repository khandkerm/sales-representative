package com.example.demo;

public class National {
	private String dbPointTypeCode;
	private String dbPointCode;
	private String dbPointId;
	private String dbPointTypeDescr;
	private String dbPointDescr;
	private String status;
	private String parentDbPointId;
	private String parentDbPointTypeId;
	
	public String getDbPointTypeCode() {
		return dbPointTypeCode;
	}
	public void setDbPointTypeCode(String dbPointTypeCode) {
		this.dbPointTypeCode = dbPointTypeCode;
	}
	public String getDbPointCode() {
		return dbPointCode;
	}
	public void setDbPointCode(String dbPointCode) {
		this.dbPointCode = dbPointCode;
	}
	public String getDbPointId() {
		return dbPointId;
	}
	public void setDbPointId(String dbPointId) {
		this.dbPointId = dbPointId;
	}
	public String getDbPointTypeDescr() {
		return dbPointTypeDescr;
	}
	public void setDbPointTypeDescr(String dbPointTypeDescr) {
		this.dbPointTypeDescr = dbPointTypeDescr;
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
	public String getParentDbPointId() {
		return parentDbPointId;
	}
	public void setParentDbPointId(String parentDbPointId) {
		this.parentDbPointId = parentDbPointId;
	}
	public String getParentDbPointTypeId() {
		return parentDbPointTypeId;
	}
	public void setParentDbPointTypeId(String parentDbPointTypeId) {
		this.parentDbPointTypeId = parentDbPointTypeId;
	}
	@Override
	public String toString() {
		return "National [dbPointTypeCode=" + dbPointTypeCode + ", dbPointCode=" + dbPointCode + ", dbPointId="
				+ dbPointId + ", dbPointTypeDescr=" + dbPointTypeDescr + ", dbPointDescr=" + dbPointDescr + ", status="
				+ status + ", parentDbPointId=" + parentDbPointId + ", parentDbPointTypeId=" + parentDbPointTypeId
				+ "]";
	}
	public National(String dbPointTypeCode, String dbPointCode, String dbPointId, String dbPointTypeDescr,
			String dbPointDescr, String status, String parentDbPointId, String parentDbPointTypeId) {
		super();
		this.dbPointTypeCode = dbPointTypeCode;
		this.dbPointCode = dbPointCode;
		this.dbPointId = dbPointId;
		this.dbPointTypeDescr = dbPointTypeDescr;
		this.dbPointDescr = dbPointDescr;
		this.status = status;
		this.parentDbPointId = parentDbPointId;
		this.parentDbPointTypeId = parentDbPointTypeId;
	}
	public National() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
