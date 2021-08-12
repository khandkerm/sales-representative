package com.example.demo;

public class Add_store_alloc {
private String DB_POINT_DESCR;
private int DB_POINT_ID;
public Add_store_alloc() {
	super();
	// TODO Auto-generated constructor stub
}
public Add_store_alloc(String dB_POINT_DESCR, int dB_POINT_ID) {
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
	return "Add_store_alloc [DB_POINT_DESCR=" + DB_POINT_DESCR + ", DB_POINT_ID=" + DB_POINT_ID + "]";
}


}
