package com.example.demo;

public class EmployeeShow {
	private String emp_id;
	private String emp_name;
	private String emp_mobile;
	private String emp_email;
	private String emp_desigDescr;
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_mobile() {
		return emp_mobile;
	}
	public void setEmp_mobile(String emp_mobile) {
		this.emp_mobile = emp_mobile;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_desigDescr() {
		return emp_desigDescr;
	}
	public void setEmp_desigDescr(String emp_desigDescr) {
		this.emp_desigDescr = emp_desigDescr;
	}
	@Override
	public String toString() {
		return "EmployeeShow [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mobile=" + emp_mobile
				+ ", emp_email=" + emp_email + ", emp_desigDescr=" + emp_desigDescr + "]";
	}
	public EmployeeShow(String emp_id, String emp_name, String emp_mobile, String emp_email, String emp_desigDescr) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_mobile = emp_mobile;
		this.emp_email = emp_email;
		this.emp_desigDescr = emp_desigDescr;
	}
	public EmployeeShow() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
