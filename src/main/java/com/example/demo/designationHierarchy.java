package com.example.demo;

public class designationHierarchy {

	private String designationID;
	private String designationName;
	private String parentDesignation;
	
	public String getDesignationID() {
		return designationID;
	}
	public void setDesignationID(String designationID) {
		this.designationID = designationID;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getParentDesignation() {
		return parentDesignation;
	}
	public void setParentDesignation(String parentDesignation) {
		this.parentDesignation = parentDesignation;
	}
	@Override
	public String toString() {
		return "designationHierarchy [designationID=" + designationID + ", designationName=" + designationName
				+ ", parentDesignation=" + parentDesignation + "]";
	}
	public designationHierarchy(String designationID, String designationName, String parentDesignation) {
		super();
		this.designationID = designationID;
		this.designationName = designationName;
		this.parentDesignation = parentDesignation;
	}
	public designationHierarchy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
