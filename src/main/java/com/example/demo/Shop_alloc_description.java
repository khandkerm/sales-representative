package com.example.demo;

public class Shop_alloc_description {
 private int EMP_ID;
 private String EMP_NAME;
 private int DB_POINT_ID;
 private String DB_POINT_DESCR;
public Shop_alloc_description(int eMP_ID, String eMP_NAME, int dB_POINT_ID, String dB_POINT_DESCR) {
	super();
	EMP_ID = eMP_ID;
	EMP_NAME = eMP_NAME;
	DB_POINT_ID = dB_POINT_ID;
	DB_POINT_DESCR = dB_POINT_DESCR;
}
public Shop_alloc_description() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEMP_ID() {
	return EMP_ID;
}
public void setEMP_ID(int eMP_ID) {
	EMP_ID = eMP_ID;
}
public String getEMP_NAME() {
	return EMP_NAME;
}
public void setEMP_NAME(String eMP_NAME) {
	EMP_NAME = eMP_NAME;
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
	return "Shop_alloc_description [EMP_ID=" + EMP_ID + ", EMP_NAME=" + EMP_NAME + ", DB_POINT_ID=" + DB_POINT_ID
			+ ", DB_POINT_DESCR=" + DB_POINT_DESCR + "]";
}
 
}
