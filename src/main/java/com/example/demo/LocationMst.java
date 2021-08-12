package com.example.demo;

public class LocationMst {
	private String level;
	private String dbPointTypeDescr;
	private String dbPointTypeCode;
	private String dbPointTypeId;
	private String parentDbPointTypeId;
	private String parentDescr;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDbPointTypeDescr() {
		return dbPointTypeDescr;
	}
	public void setDbPointTypeDescr(String dbPointTypeDescr) {
		this.dbPointTypeDescr = dbPointTypeDescr;
	}
	public String getDbPointTypeCode() {
		return dbPointTypeCode;
	}
	public void setDbPointTypeCode(String dbPointTypeCode) {
		this.dbPointTypeCode = dbPointTypeCode;
	}
	public String getDbPointTypeId() {
		return dbPointTypeId;
	}
	public void setDbPointTypeId(String dbPointTypeId) {
		this.dbPointTypeId = dbPointTypeId;
	}
	public String getParentDbPointTypeId() {
		return parentDbPointTypeId;
	}
	public void setParentDbPointTypeId(String parentDbPointTypeId) {
		this.parentDbPointTypeId = parentDbPointTypeId;
	}
	public String getParentDescr() {
		return parentDescr;
	}
	public void setParentDescr(String parentDescr) {
		this.parentDescr = parentDescr;
	}
	@Override
	public String toString() {
		return "LocationMst [level=" + level + ", dbPointTypeDescr=" + dbPointTypeDescr + ", dbPointTypeCode="
				+ dbPointTypeCode + ", dbPointTypeId=" + dbPointTypeId + ", parentDbPointTypeId=" + parentDbPointTypeId
				+ ", parentDescr=" + parentDescr + "]";
	}
	public LocationMst(String level, String dbPointTypeDescr, String dbPointTypeCode, String dbPointTypeId,
			String parentDbPointTypeId, String parentDescr) {
		super();
		this.level = level;
		this.dbPointTypeDescr = dbPointTypeDescr;
		this.dbPointTypeCode = dbPointTypeCode;
		this.dbPointTypeId = dbPointTypeId;
		this.parentDbPointTypeId = parentDbPointTypeId;
		this.parentDescr = parentDescr;
	}
	public LocationMst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
