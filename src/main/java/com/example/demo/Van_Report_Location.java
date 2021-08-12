package com.example.demo;

public class Van_Report_Location {
private int DB_POINT_ID;
private String DB_POINT_DESCR;
public Van_Report_Location() {
	super();
	// TODO Auto-generated constructor stub
}
public Van_Report_Location(int dB_POINT_ID, String dB_POINT_DESCR) {
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
	return "Van_Report_Location [DB_POINT_ID=" + DB_POINT_ID + ", DB_POINT_DESCR=" + DB_POINT_DESCR + "]";
}

}
