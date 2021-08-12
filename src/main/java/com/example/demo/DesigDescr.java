package com.example.demo;

public class DesigDescr {
	private String emp_name;

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "DesigDescr [emp_name=" + emp_name + "]";
	}

	public DesigDescr(String emp_name) {
		super();
		this.emp_name = emp_name;
	}

	public DesigDescr() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
