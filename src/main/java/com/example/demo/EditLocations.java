package com.example.demo;

public class EditLocations {
	private String locationDesc;
	private String status;
	
	public String getLocationDesc() {
		return locationDesc;
	}
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EditLocations [locationDesc=" + locationDesc + ", status=" + status + "]";
	}
	public EditLocations(String locationDesc, String status) {
		super();
		this.locationDesc = locationDesc;
		this.status = status;
	}
	public EditLocations() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
