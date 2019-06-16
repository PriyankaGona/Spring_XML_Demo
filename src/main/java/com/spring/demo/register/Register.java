package com.spring.demo.register;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Register {
	
	private Integer reg_id;
	private String reg_name;
	private String reg_email;
	
	public Register() {
		
	}
	
	public Register(Integer reg_id, String reg_name, String reg_email) {
		this.reg_id = reg_id;
		this.reg_name = reg_name;
		this.reg_email = reg_email;
	}
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	public String getReg_email() {
		return reg_email;
	}
	public void setReg_email(String reg_email) {
		this.reg_email = reg_email;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + reg_id + ", name=" + reg_name + ", email=" + reg_email +"]";
	}
}
