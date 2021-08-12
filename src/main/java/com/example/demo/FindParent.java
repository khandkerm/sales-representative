package com.example.demo;

public class FindParent {
	private String parentId;
	private String parentName;
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	@Override
	public String toString() {
		return "FindParent [parentId=" + parentId + ", parentName=" + parentName + "]";
	}
	public FindParent(String parentId, String parentName) {
		super();
		this.parentId = parentId;
		this.parentName = parentName;
	}
	public FindParent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
