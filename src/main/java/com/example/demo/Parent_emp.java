package com.example.demo;

public class Parent_emp {
private int EMP_CODE;
private String EMP_NAME;
public Parent_emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Parent_emp(int eMP_CODE, String eMP_NAME) {
	super();
	EMP_CODE = eMP_CODE;
	EMP_NAME = eMP_NAME;
}
public int getEMP_CODE() {
	return EMP_CODE;
}
public void setEMP_CODE(int eMP_CODE) {
	EMP_CODE = eMP_CODE;
}
public String getEMP_NAME() {
	return EMP_NAME;
}
public void setEMP_NAME(String eMP_NAME) {
	EMP_NAME = eMP_NAME;
}
@Override
public String toString() {
	return "Parent_emp [EMP_CODE=" + EMP_CODE + ", EMP_NAME=" + EMP_NAME + "]";
}






}
