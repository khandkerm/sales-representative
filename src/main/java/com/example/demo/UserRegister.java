package com.example.demo;

public class UserRegister {

	private String user_id;
	private String emp_code;
	private String emp_pass;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public String getEmp_pass() {
		return emp_pass;
	}
	public void setEmp_pass(String emp_pass) {
		this.emp_pass = emp_pass;
	}
	public UserRegister(String user_id, String emp_code, String emp_pass) {
		super();
		this.user_id = user_id;
		this.emp_code = emp_code;
		this.emp_pass = emp_pass;
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRegister [user_id=" + user_id + ", emp_code=" + emp_code + ", emp_pass=" + emp_pass + "]";
	}
	
	
}
