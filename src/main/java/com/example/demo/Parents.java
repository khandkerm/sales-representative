package com.example.demo;

public class Parents {
	private String level;
	private String catCode;
	private String catDescr;
	private String catId;
	private String parentCatId;
	private String parentDescr;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	public String getCatDescr() {
		return catDescr;
	}
	public void setCatDescr(String catDescr) {
		this.catDescr = catDescr;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getParentCatId() {
		return parentCatId;
	}
	public void setParentCatId(String parentCatId) {
		this.parentCatId = parentCatId;
	}
	public String getParentDescr() {
		return parentDescr;
	}
	public void setParentDescr(String parentDescr) {
		this.parentDescr = parentDescr;
	}
	@Override
	public String toString() {
		return "Parents [level=" + level + ", catCode=" + catCode + ", catDescr=" + catDescr + ", catId=" + catId
				+ ", parentCatId=" + parentCatId + ", parentDescr=" + parentDescr + "]";
	}
	public Parents(String level, String catCode, String catDescr, String catId, String parentCatId,
			String parentDescr) {
		super();
		this.level = level;
		this.catCode = catCode;
		this.catDescr = catDescr;
		this.catId = catId;
		this.parentCatId = parentCatId;
		this.parentDescr = parentDescr;
	}
	public Parents() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
