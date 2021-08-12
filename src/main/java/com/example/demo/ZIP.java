package com.example.demo;

public class ZIP {
	private String ZIP_CODE;
	private String AREA_DESCR;
	public ZIP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ZIP(String zIP_CODE, String aREA_DESCR) {
		super();
		ZIP_CODE = zIP_CODE;
		AREA_DESCR = aREA_DESCR;
	}
	public String getZIP_CODE() {
		return ZIP_CODE;
	}
	public void setZIP_CODE(String zIP_CODE) {
		ZIP_CODE = zIP_CODE;
	}
	public String getAREA_DESCR() {
		return AREA_DESCR;
	}
	public void setAREA_DESCR(String aREA_DESCR) {
		AREA_DESCR = aREA_DESCR;
	}
	@Override
	public String toString() {
		return "ZIP [ZIP_CODE=" + ZIP_CODE + ", AREA_DESCR=" + AREA_DESCR + "]";
	}
	
}
