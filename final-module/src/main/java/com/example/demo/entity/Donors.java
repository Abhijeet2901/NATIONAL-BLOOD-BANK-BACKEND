package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Donors {
  
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String firstname;
	private String lastname;
	private Integer age;
	private String gender;
	private Date dob;
	private Integer height;
	private Integer weight;
	private String mailid;
	private String phoneno;
	private String address;
	private String bloodgroup;
	private String flag;
	private String ldd;
	
	public Donors()
	{
		
	}

	public Donors(Integer id, String firstname, String lastname, Integer age, String gender, Date dob, Integer height,
			Integer weight, String mailid, String phoneno, String address, String bloodgroup, String flag, String ldd) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.mailid = mailid;
		this.phoneno = phoneno;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.flag = flag;
		this.ldd = ldd;
	}

	public Donors(String firstname, String lastname, Integer age, String gender, Date dob, Integer height,
			Integer weight, String mailid, String phoneno, String address, String bloodgroup, String flag, String ldd) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.mailid = mailid;
		this.phoneno = phoneno;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.flag = flag;
		this.ldd = ldd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}
	
	public String getDob1()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dob1=sdf.format(this.getDob());
		return dob1;
	}

	public void setDob1(Date dob)
	{
		this.dob=dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getLdd() {
		return ldd;
	}
	
//	public String getLdd1()
//	{
//		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
//		String ldd1=sdf1.format(this.getLdd());
//		return ldd1;
//	}

	public void setLdd(String ldd) {
		this.ldd = ldd;
	}

	@Override
	public String toString() {
		return "Donors [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender="
				+ gender + ", dob=" + dob + ", height=" + height + ", weight=" + weight + ", mailid=" + mailid
				+ ", phoneno=" + phoneno + ", address=" + address + ", bloodgroup=" + bloodgroup + ", flag=" + flag
				+ ", ldd=" + ldd + "]";
	}
	
	
	
	
}
