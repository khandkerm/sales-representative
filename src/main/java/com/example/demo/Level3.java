package com.example.demo;

public class Level3 {
	private String ITEM_CODE;
	private String CAT_CODE;
	private String ITEM_DESCR;
	private String ITEM_ID;
	private String STATUS;
	private String PARENT_ITEM_ID;
	public String getITEM_CODE() {
		return ITEM_CODE;
	}
	public void setITEM_CODE(String iTEM_CODE) {
		ITEM_CODE = iTEM_CODE;
	}
	public String getCAT_CODE() {
		return CAT_CODE;
	}
	public void setCAT_CODE(String cAT_CODE) {
		CAT_CODE = cAT_CODE;
	}
	public String getITEM_DESCR() {
		return ITEM_DESCR;
	}
	public void setITEM_DESCR(String iTEM_DESCR) {
		ITEM_DESCR = iTEM_DESCR;
	}
	public String getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(String iTEM_ID) {
		ITEM_ID = iTEM_ID;
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
	@Override
	public String toString() {
		return "Level3 [ITEM_CODE=" + ITEM_CODE + ", CAT_CODE=" + CAT_CODE + ", ITEM_DESCR=" + ITEM_DESCR + ", ITEM_ID="
				+ ITEM_ID + ", STATUS=" + STATUS + ", PARENT_ITEM_ID=" + PARENT_ITEM_ID + "]";
	}
	public Level3(String iTEM_CODE, String cAT_CODE, String iTEM_DESCR, String iTEM_ID, String sTATUS,
			String pARENT_ITEM_ID) {
		super();
		ITEM_CODE = iTEM_CODE;
		CAT_CODE = cAT_CODE;
		ITEM_DESCR = iTEM_DESCR;
		ITEM_ID = iTEM_ID;
		STATUS = sTATUS;
		PARENT_ITEM_ID = pARENT_ITEM_ID;
	}
	public Level3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
