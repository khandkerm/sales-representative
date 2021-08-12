package com.example.demo;

public class LocDescr {
	private String dbPointDescr;

	public String getDbPointDescr() {
		return dbPointDescr;
	}

	public void setDbPointDescr(String dbPointDescr) {
		this.dbPointDescr = dbPointDescr;
	}

	@Override
	public String toString() {
		return "LocDescr [dbPointDescr=" + dbPointDescr + "]";
	}

	public LocDescr(String dbPointDescr) {
		super();
		this.dbPointDescr = dbPointDescr;
	}

	public LocDescr() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
