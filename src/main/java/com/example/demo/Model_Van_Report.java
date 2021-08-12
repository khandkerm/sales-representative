package com.example.demo;

public class Model_Van_Report {
private int DL_ID;
private int ITEM_ID;
private String BRAND_NAME;
private String ITEM_NAME;
private int QNTY;
public Model_Van_Report() {
	super();
	// TODO Auto-generated constructor stub
}
public Model_Van_Report(int dL_ID, int iTEM_ID, String bRAND_NAME, String iTEM_NAME, int qNTY) {
	super();
	DL_ID = dL_ID;
	ITEM_ID = iTEM_ID;
	BRAND_NAME = bRAND_NAME;
	ITEM_NAME = iTEM_NAME;
	QNTY = qNTY;
}
public int getDL_ID() {
	return DL_ID;
}
public void setDL_ID(int dL_ID) {
	DL_ID = dL_ID;
}
public int getITEM_ID() {
	return ITEM_ID;
}
public void setITEM_ID(int iTEM_ID) {
	ITEM_ID = iTEM_ID;
}
public String getBRAND_NAME() {
	return BRAND_NAME;
}
public void setBRAND_NAME(String bRAND_NAME) {
	BRAND_NAME = bRAND_NAME;
}
public String getITEM_NAME() {
	return ITEM_NAME;
}
public void setITEM_NAME(String iTEM_NAME) {
	ITEM_NAME = iTEM_NAME;
}
public int getQNTY() {
	return QNTY;
}
public void setQNTY(int qNTY) {
	QNTY = qNTY;
}
@Override
public String toString() {
	return "Model_Van_Report [DL_ID=" + DL_ID + ", ITEM_ID=" + ITEM_ID + ", BRAND_NAME=" + BRAND_NAME + ", ITEM_NAME="
			+ ITEM_NAME + ", QNTY=" + QNTY + "]";
}

}
