package com.example.demo;

public class DISTRICT {
private String DIST_CODE;
private String DIST_DESCR;
public DISTRICT() {
	super();
	// TODO Auto-generated constructor stub
}
public DISTRICT(String dIST_CODE, String dIST_DESCR) {
	super();
	DIST_CODE = dIST_CODE;
	DIST_DESCR = dIST_DESCR;
}
public String getDIST_CODE() {
	return DIST_CODE;
}
public void setDIST_CODE(String dIST_CODE) {
	DIST_CODE = dIST_CODE;
}
public String getDIST_DESCR() {
	return DIST_DESCR;
}
public void setDIST_DESCR(String dIST_DESCR) {
	DIST_DESCR = dIST_DESCR;
}
@Override
public String toString() {
	return "DISTRICT [DIST_CODE=" + DIST_CODE + ", DIST_DESCR=" + DIST_DESCR + "]";
}

}
