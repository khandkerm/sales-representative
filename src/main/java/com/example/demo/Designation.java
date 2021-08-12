package com.example.demo;

public class Designation {
private String DESIG_CODE;
private String DESIG_DESCR;
public Designation() {
	super();
	// TODO Auto-generated constructor stub
}
public Designation(String dESIG_CODE, String dESIG_DESCR) {
	super();
	DESIG_CODE = dESIG_CODE;
	DESIG_DESCR = dESIG_DESCR;
}
public String getDESIG_CODE() {
	return DESIG_CODE;
}
public void setDESIG_CODE(String dESIG_CODE) {
	DESIG_CODE = dESIG_CODE;
}
public String getDESIG_DESCR() {
	return DESIG_DESCR;
}
public void setDESIG_DESCR(String dESIG_DESCR) {
	DESIG_DESCR = dESIG_DESCR;
}
@Override
public String toString() {
	return "Designation [DESIG_CODE=" + DESIG_CODE + ", DESIG_DESCR=" + DESIG_DESCR + "]";
}
	
	
}
