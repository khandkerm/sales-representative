package com.example.demo;

public class Employee_Model {
private int Employee_id;
private String Employee_code;
private String Employee_name;
private String Designation_code;
private String Shortname;
private int Parent_Emp_id;
private String Email;
private String Mobile;
public Employee_Model() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee_Model(int employee_id, String employee_code, String employee_name, String designation_code,
		String shortname, int parent_Emp_id, String email, String mobile) {
	super();
	Employee_id = employee_id;
	Employee_code = employee_code;
	Employee_name = employee_name;
	Designation_code = designation_code;
	Shortname = shortname;
	Parent_Emp_id = parent_Emp_id;
	Email = email;
	Mobile = mobile;
}
public int getEmployee_id() {
	return Employee_id;
}
public void setEmployee_id(int employee_id) {
	Employee_id = employee_id;
}
public String getEmployee_code() {
	return Employee_code;
}
public void setEmployee_code(String employee_code) {
	Employee_code = employee_code;
}
public String getEmployee_name() {
	return Employee_name;
}
public void setEmployee_name(String employee_name) {
	Employee_name = employee_name;
}
public String getDesignation_code() {
	return Designation_code;
}
public void setDesignation_code(String designation_code) {
	Designation_code = designation_code;
}
public String getShortname() {
	return Shortname;
}
public void setShortname(String shortname) {
	Shortname = shortname;
}
public int getParent_Emp_id() {
	return Parent_Emp_id;
}
public void setParent_Emp_id(int parent_Emp_id) {
	Parent_Emp_id = parent_Emp_id;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getMobile() {
	return Mobile;
}
public void setMobile(String mobile) {
	Mobile = mobile;
}
@Override
public String toString() {
	return "Employee_Model [Employee_id=" + Employee_id + ", Employee_code=" + Employee_code + ", Employee_name="
			+ Employee_name + ", Designation_code=" + Designation_code + ", Shortname=" + Shortname + ", Parent_Emp_id="
			+ Parent_Emp_id + ", Email=" + Email + ", Mobile=" + Mobile + "]";
}

}
