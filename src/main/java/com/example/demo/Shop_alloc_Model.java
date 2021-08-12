package com.example.demo;

public class Shop_alloc_Model {
	private String DB_POINT_DESCR;

	private int DB_POINT_ID;
	public Shop_alloc_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop_alloc_Model(String dB_POINT_DESCR, int dB_POINT_ID) {
		super();
		DB_POINT_DESCR = dB_POINT_DESCR;
		DB_POINT_ID = dB_POINT_ID;
	}
	public String getDB_POINT_DESCR() {
		return DB_POINT_DESCR;
	}
	public void setDB_POINT_DESCR(String dB_POINT_DESCR) {
		DB_POINT_DESCR = dB_POINT_DESCR;
	}
	public int getDB_POINT_ID() {
		return DB_POINT_ID;
	}
	public void setDB_POINT_ID(int dB_POINT_ID) {
		DB_POINT_ID = dB_POINT_ID;
	}
	@Override
	public String toString() {
		return "Shop_alloc_Model [DB_POINT_DESCR=" + DB_POINT_DESCR + ", DB_POINT_ID=" + DB_POINT_ID + "]";
	}


}
