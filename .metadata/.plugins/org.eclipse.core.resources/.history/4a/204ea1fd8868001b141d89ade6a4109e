package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQuery(name="emailid", query = "select r from Registration r where r.emailid=:emailid")
@Entity
//@Table(name="REGISTRATION")
public class Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String fname;
	private String lname;
	private String emailid;
	private String phoneno;
	private String password;
	private String confirmpassword;
	
	public Registration()  {}

	public Registration(Integer id, String fname, String lname, String emailid, String phoneno, String password,String confirmpassword)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	
	public Registration(String fname, String lname, String emailid, String phoneno, String password,String confirmpassword) 
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "RegistController [id=" + id + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
}
