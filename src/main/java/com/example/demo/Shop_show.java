package com.example.demo;

public class Shop_show {
private int DB_POINT_ID;
private String DB_POINT_DESCR;
private String DIV_CODE;
private String DIV_DESC;
public Shop_show() {
	super();
	// TODO Auto-generated constructor stub
}
public Shop_show(int dB_POINT_ID, String dB_POINT_DESCR, String dIV_CODE, String dIV_DESC) {
	super();
	DB_POINT_ID = dB_POINT_ID;
	DB_POINT_DESCR = dB_POINT_DESCR;
	DIV_CODE = dIV_CODE;
	DIV_DESC = dIV_DESC;
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
public String getDIV_CODE() {
	return DIV_CODE;
}
public void setDIV_CODE(String dIV_CODE) {
	DIV_CODE = dIV_CODE;
}
public String getDIV_DESC() {
	return DIV_DESC;
}
public void setDIV_DESC(String dIV_DESC) {
	DIV_DESC = dIV_DESC;
}
@Override
public String toString() {
	return "Shop_show [DB_POINT_ID=" + DB_POINT_ID + ", DB_POINT_DESCR=" + DB_POINT_DESCR + ", DIV_CODE=" + DIV_CODE
			+ ", DIV_DESC=" + DIV_DESC + "]";
}


}
