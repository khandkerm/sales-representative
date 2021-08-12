package com.example.demo;

public class Division_Model {
private String DIV_CODE;
private String DIV_DESC;
public Division_Model() {
	super();
	// TODO Auto-generated constructor stub
}
public Division_Model(String dIV_CODE, String dIV_DESC) {
	super();
	DIV_CODE = dIV_CODE;
	DIV_DESC = dIV_DESC;
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
	return "Division_Model [DIV_CODE=" + DIV_CODE + ", DIV_DESC=" + DIV_DESC + "]";
}

}
