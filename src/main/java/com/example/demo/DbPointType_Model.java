package com.example.demo;

public class DbPointType_Model {
private String DB_POINT_TYPE_CODE;
private String DB_POINT_TYPE_DESCR;
public DbPointType_Model() {
	super();
	// TODO Auto-generated constructor stub
}
public DbPointType_Model(String dB_POINT_TYPE_CODE, String dB_POINT_TYPE_DESCR) {
	super();
	DB_POINT_TYPE_CODE = dB_POINT_TYPE_CODE;
	DB_POINT_TYPE_DESCR = dB_POINT_TYPE_DESCR;
}
public String getDB_POINT_TYPE_CODE() {
	return DB_POINT_TYPE_CODE;
}
public void setDB_POINT_TYPE_CODE(String dB_POINT_TYPE_CODE) {
	DB_POINT_TYPE_CODE = dB_POINT_TYPE_CODE;
}
public String getDB_POINT_TYPE_DESCR() {
	return DB_POINT_TYPE_DESCR;
}
public void setDB_POINT_TYPE_DESCR(String dB_POINT_TYPE_DESCR) {
	DB_POINT_TYPE_DESCR = dB_POINT_TYPE_DESCR;
}
@Override
public String toString() {
	return "DbPointType_Model [DB_POINT_TYPE_CODE=" + DB_POINT_TYPE_CODE + ", DB_POINT_TYPE_DESCR="
			+ DB_POINT_TYPE_DESCR + "]";
}

}
