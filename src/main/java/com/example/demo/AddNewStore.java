package com.example.demo;

public class AddNewStore {
private int DB_POINT_ID;
private String DB_POINT_DESCR;
private String DB_POINT_TYPE_CODE;
private int PARENT_DB_POINT_ID;
private String DIV_CODE;
private String DIST_CODE;
private String THANA_CODE;
private String ZIP_CODE;
private String CONT_PERSION1;
private String CONT_PERSION2;
private String MOBILE1;
private String MOBILE2;
private String ADDR1;
private String ADDR2;
private String TRADE_LIC_NO;
private String VAT_REG_NO;
private String Email;
private String Webadd;
public AddNewStore() {
	super();
	// TODO Auto-generated constructor stub
}
public AddNewStore(int dB_POINT_ID, String dB_POINT_DESCR, String dB_POINT_TYPE_CODE, int pARENT_DB_POINT_ID,
		String dIV_CODE, String dIST_CODE, String tHANA_CODE, String zIP_CODE, String cONT_PERSION1,
		String cONT_PERSION2, String mOBILE1, String mOBILE2, String aDDR1, String aDDR2, String tRADE_LIC_NO,
		String vAT_REG_NO, String email, String webadd) {
	super();
	DB_POINT_ID = dB_POINT_ID;
	DB_POINT_DESCR = dB_POINT_DESCR;
	DB_POINT_TYPE_CODE = dB_POINT_TYPE_CODE;
	PARENT_DB_POINT_ID = pARENT_DB_POINT_ID;
	DIV_CODE = dIV_CODE;
	DIST_CODE = dIST_CODE;
	THANA_CODE = tHANA_CODE;
	ZIP_CODE = zIP_CODE;
	CONT_PERSION1 = cONT_PERSION1;
	CONT_PERSION2 = cONT_PERSION2;
	MOBILE1 = mOBILE1;
	MOBILE2 = mOBILE2;
	ADDR1 = aDDR1;
	ADDR2 = aDDR2;
	TRADE_LIC_NO = tRADE_LIC_NO;
	VAT_REG_NO = vAT_REG_NO;
	Email = email;
	Webadd = webadd;
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
public String getDB_POINT_TYPE_CODE() {
	return DB_POINT_TYPE_CODE;
}
public void setDB_POINT_TYPE_CODE(String dB_POINT_TYPE_CODE) {
	DB_POINT_TYPE_CODE = dB_POINT_TYPE_CODE;
}
public int getPARENT_DB_POINT_ID() {
	return PARENT_DB_POINT_ID;
}
public void setPARENT_DB_POINT_ID(int pARENT_DB_POINT_ID) {
	PARENT_DB_POINT_ID = pARENT_DB_POINT_ID;
}
public String getDIV_CODE() {
	return DIV_CODE;
}
public void setDIV_CODE(String dIV_CODE) {
	DIV_CODE = dIV_CODE;
}
public String getDIST_CODE() {
	return DIST_CODE;
}
public void setDIST_CODE(String dIST_CODE) {
	DIST_CODE = dIST_CODE;
}
public String getTHANA_CODE() {
	return THANA_CODE;
}
public void setTHANA_CODE(String tHANA_CODE) {
	THANA_CODE = tHANA_CODE;
}
public String getZIP_CODE() {
	return ZIP_CODE;
}
public void setZIP_CODE(String zIP_CODE) {
	ZIP_CODE = zIP_CODE;
}
public String getCONT_PERSION1() {
	return CONT_PERSION1;
}
public void setCONT_PERSION1(String cONT_PERSION1) {
	CONT_PERSION1 = cONT_PERSION1;
}
public String getCONT_PERSION2() {
	return CONT_PERSION2;
}
public void setCONT_PERSION2(String cONT_PERSION2) {
	CONT_PERSION2 = cONT_PERSION2;
}
public String getMOBILE1() {
	return MOBILE1;
}
public void setMOBILE1(String mOBILE1) {
	MOBILE1 = mOBILE1;
}
public String getMOBILE2() {
	return MOBILE2;
}
public void setMOBILE2(String mOBILE2) {
	MOBILE2 = mOBILE2;
}
public String getADDR1() {
	return ADDR1;
}
public void setADDR1(String aDDR1) {
	ADDR1 = aDDR1;
}
public String getADDR2() {
	return ADDR2;
}
public void setADDR2(String aDDR2) {
	ADDR2 = aDDR2;
}
public String getTRADE_LIC_NO() {
	return TRADE_LIC_NO;
}
public void setTRADE_LIC_NO(String tRADE_LIC_NO) {
	TRADE_LIC_NO = tRADE_LIC_NO;
}
public String getVAT_REG_NO() {
	return VAT_REG_NO;
}
public void setVAT_REG_NO(String vAT_REG_NO) {
	VAT_REG_NO = vAT_REG_NO;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getWebadd() {
	return Webadd;
}
public void setWebadd(String webadd) {
	Webadd = webadd;
}
@Override
public String toString() {
	return "AddNewStore [DB_POINT_ID=" + DB_POINT_ID + ", DB_POINT_DESCR=" + DB_POINT_DESCR + ", DB_POINT_TYPE_CODE="
			+ DB_POINT_TYPE_CODE + ", PARENT_DB_POINT_ID=" + PARENT_DB_POINT_ID + ", DIV_CODE=" + DIV_CODE
			+ ", DIST_CODE=" + DIST_CODE + ", THANA_CODE=" + THANA_CODE + ", ZIP_CODE=" + ZIP_CODE + ", CONT_PERSION1="
			+ CONT_PERSION1 + ", CONT_PERSION2=" + CONT_PERSION2 + ", MOBILE1=" + MOBILE1 + ", MOBILE2=" + MOBILE2
			+ ", ADDR1=" + ADDR1 + ", ADDR2=" + ADDR2 + ", TRADE_LIC_NO=" + TRADE_LIC_NO + ", VAT_REG_NO=" + VAT_REG_NO
			+ ", Email=" + Email + ", Webadd=" + Webadd + "]";
}



}
