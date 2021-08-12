package com.example.demo;

public class Level1 {

	
	private String CAT_CODE;
	private String CAT_DESCR;
	private String CAT_ID;
	private String STATUS;
	private String PARENT_CAT_ID;
	public Level1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Level1(String cAT_CODE, String cAT_DESCR, String cAT_ID, String sTATUS, String pARENT_CAT_ID) {
		super();
		CAT_CODE = cAT_CODE;
		CAT_DESCR = cAT_DESCR;
		CAT_ID = cAT_ID;
		STATUS = sTATUS;
		PARENT_CAT_ID = pARENT_CAT_ID;
	}
	public String getCAT_CODE() {
		return CAT_CODE;
	}
	public void setCAT_CODE(String cAT_CODE) {
		CAT_CODE = cAT_CODE;
	}
	public String getCAT_DESCR() {
		return CAT_DESCR;
	}
	public void setCAT_DESCR(String cAT_DESCR) {
		CAT_DESCR = cAT_DESCR;
	}
	public String getCAT_ID() {
		return CAT_ID;
	}
	public void setCAT_ID(String cAT_ID) {
		CAT_ID = cAT_ID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getPARENT_CAT_ID() {
		return PARENT_CAT_ID;
	}
	public void setPARENT_CAT_ID(String pARENT_CAT_ID) {
		PARENT_CAT_ID = pARENT_CAT_ID;
	}
	@Override
	public String toString() {
		return "Level1 [CAT_CODE=" + CAT_CODE + ", CAT_DESCR=" + CAT_DESCR + ", CAT_ID=" + CAT_ID + ", STATUS=" + STATUS
				+ ", PARENT_CAT_ID=" + PARENT_CAT_ID + "]";
	}
	
	 
}
