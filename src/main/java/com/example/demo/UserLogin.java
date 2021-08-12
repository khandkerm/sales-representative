package com.example.demo;

public class UserLogin {

	private String user_id;
	private String emp_pass;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmp_pass() {
		return emp_pass;
	}
	public void setEmp_pass(String emp_pass) {
		this.emp_pass = emp_pass;
	}
	public UserLogin(String user_id, String emp_pass) {
		super();
		this.user_id = user_id;
		this.emp_pass = emp_pass;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLogin [user_id=" + user_id + ", emp_pass=" + emp_pass + "]";
	}
	
	
}
