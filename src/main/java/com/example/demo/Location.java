package com.example.demo;

public class Location {
	private String locationId;
	private String locationDecs;
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getLocationDecs() {
		return locationDecs;
	}
	public void setLocationDecs(String locationDecs) {
		this.locationDecs = locationDecs;
	}
	public Location(String locationId, String locationDecs) {
		super();
		this.locationId = locationId;
		this.locationDecs = locationDecs;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationDecs=" + locationDecs + "]";
	}
	

}
