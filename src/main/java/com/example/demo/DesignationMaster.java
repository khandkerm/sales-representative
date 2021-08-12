package com.example.demo;

public class DesignationMaster {
	private String level;
	private String desig_descr;
	private String desig_code;
	private String desig_id;
	private String parent_desig_id;
	private String parent_descr;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDesig_descr() {
		return desig_descr;
	}
	public void setDesig_descr(String desig_descr) {
		this.desig_descr = desig_descr;
	}
	public String getDesig_code() {
		return desig_code;
	}
	public void setDesig_code(String desig_code) {
		this.desig_code = desig_code;
	}
	public String getDesig_id() {
		return desig_id;
	}
	public void setDesig_id(String desig_id) {
		this.desig_id = desig_id;
	}
	public String getParent_desig_id() {
		return parent_desig_id;
	}
	public void setParent_desig_id(String parent_desig_id) {
		this.parent_desig_id = parent_desig_id;
	}
	public String getParent_descr() {
		return parent_descr;
	}
	public void setParent_descr(String parent_descr) {
		this.parent_descr = parent_descr;
	}
	@Override
	public String toString() {
		return "DesignationMaster [level=" + level + ", desig_descr=" + desig_descr + ", desig_code=" + desig_code
				+ ", desig_id=" + desig_id + ", parent_desig_id=" + parent_desig_id + ", parent_descr=" + parent_descr
				+ "]";
	}
	public DesignationMaster(String level, String desig_descr, String desig_code, String desig_id,
			String parent_desig_id, String parent_descr) {
		super();
		this.level = level;
		this.desig_descr = desig_descr;
		this.desig_code = desig_code;
		this.desig_id = desig_id;
		this.parent_desig_id = parent_desig_id;
		this.parent_descr = parent_descr;
	}
	public DesignationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
