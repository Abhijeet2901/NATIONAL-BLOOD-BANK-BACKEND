package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERREQUEST")
public class UserRequest {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE )
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String email;
	private String contactNo;
	private String address;
	private String bloodGroup;
	private Integer unit;
	
	public UserRequest() {}

	public UserRequest(Integer id, String firstName, String lastName, Integer age, String gender, String email,
			String contactNo, String address, String bloodGroup, Integer unit) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.unit = unit;
	}

	public UserRequest(String firstName, String lastName, Integer age, String gender, String email,
			String contactNo, String address, String bloodGroup, Integer unit) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.unit = unit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getcontactNo() {
		return contactNo;
	}

	public void setcontactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "UserRequest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", contactNo=" + contactNo + ", address="
				+ address + ", bloodGroup=" + bloodGroup + ", unit=" + unit + "]";
	}
	
	
	
	
	
	

}
