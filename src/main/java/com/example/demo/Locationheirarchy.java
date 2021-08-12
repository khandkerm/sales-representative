package com.example.demo;

public class Locationheirarchy {

	private String locationID;
	private String locationName;
	private String parent_locationName;
	public String getLocationID() {
		return locationID;
	}
	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getParent_locationName() {
		return parent_locationName;
	}
	public void setParent_locationName(String parent_locationName) {
		this.parent_locationName = parent_locationName;
	}
	@Override
	public String toString() {
		return "Locationheirarchy [locationID=" + locationID + ", locationName=" + locationName
				+ ", parent_locationName=" + parent_locationName + "]";
	}
	public Locationheirarchy(String locationID, String locationName, String parent_locationName) {
		super();
		this.locationID = locationID;
		this.locationName = locationName;
		this.parent_locationName = parent_locationName;
	}
	public Locationheirarchy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

