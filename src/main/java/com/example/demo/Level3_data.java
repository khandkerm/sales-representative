package com.example.demo;

public class Level3_data {
	
	private String ITEM_CODE;
	private String ITEM_DESCR;
	private String STATUS;
	private String PARENT_ITEM_ID;
	private String CAT_CODE;
	public String getITEM_CODE() {
		return ITEM_CODE;
	}
	public void setITEM_CODE(String iTEM_CODE) {
		ITEM_CODE = iTEM_CODE;
	}
	public String getITEM_DESCR() {
		return ITEM_DESCR;
	}
	public void setITEM_DESCR(String iTEM_DESCR) {
		ITEM_DESCR = iTEM_DESCR;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getPARENT_ITEM_ID() {
		return PARENT_ITEM_ID;
	}
	public void setPARENT_ITEM_ID(String pARENT_ITEM_ID) {
		PARENT_ITEM_ID = pARENT_ITEM_ID;
	}
	public String getCAT_CODE() {
		return CAT_CODE;
	}
	public void setCAT_CODE(String cAT_CODE) {
		CAT_CODE = cAT_CODE;
	}
	@Override
	public String toString() {
		return "Level3_data [ITEM_CODE=" + ITEM_CODE + ", ITEM_DESCR=" + ITEM_DESCR + ", STATUS=" + STATUS
				+ ", PARENT_ITEM_ID=" + PARENT_ITEM_ID + ", CAT_CODE=" + CAT_CODE + "]";
	}
	public Level3_data(String iTEM_CODE, String iTEM_DESCR, String sTATUS, String pARENT_ITEM_ID, String cAT_CODE) {
		super();
		ITEM_CODE = iTEM_CODE;
		ITEM_DESCR = iTEM_DESCR;
		STATUS = sTATUS;
		PARENT_ITEM_ID = pARENT_ITEM_ID;
		CAT_CODE = cAT_CODE;
	}
	public Level3_data() {
		super();
		// TODO Auto-generated constructor stub
	}

}
