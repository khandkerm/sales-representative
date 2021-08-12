package com.example.demo;

public class ParentDbPoint_Model {
	private int DB_POINT_ID;
	private String DB_POINT_DESCR;
	public ParentDbPoint_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParentDbPoint_Model(int dB_POINT_ID, String dB_POINT_DESCR) {
		super();
		DB_POINT_ID = dB_POINT_ID;
		DB_POINT_DESCR = dB_POINT_DESCR;
	}
	public int getDB_POINT_ID() {
		return DB_POINT_ID;
	}
	public void setDB_POINT_ID(int dB_POINT_ID) {
		DB_POINT_ID = dB_POINT_ID;
	}
	public String getDB_POINT_DESCR() {
		return DB_POINT_DESCR;
	}
	public void setDB_POINT_DESCR(String dB_POINT_DESCR) {
		DB_POINT_DESCR = dB_POINT_DESCR;
	}
	@Override
	public String toString() {
		return "ParentDbPoint_Model [DB_POINT_ID=" + DB_POINT_ID + ", DB_POINT_DESCR=" + DB_POINT_DESCR + "]";
	}
	

}
