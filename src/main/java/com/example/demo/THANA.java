package com.example.demo;

public class THANA {
	private String THANA_CODE;
	private String THANA_DESCR;
	public THANA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public THANA(String tHANA_CODE, String tHANA_DESCR) {
		super();
		THANA_CODE = tHANA_CODE;
		THANA_DESCR = tHANA_DESCR;
	}
	public String getTHANA_CODE() {
		return THANA_CODE;
	}
	public void setTHANA_CODE(String tHANA_CODE) {
		THANA_CODE = tHANA_CODE;
	}
	public String getTHANA_DESCR() {
		return THANA_DESCR;
	}
	public void setTHANA_DESCR(String tHANA_DESCR) {
		THANA_DESCR = tHANA_DESCR;
	}
	@Override
	public String toString() {
		return "THANA [THANA_CODE=" + THANA_CODE + ", THANA_DESCR=" + THANA_DESCR + "]";
	}
	
}
