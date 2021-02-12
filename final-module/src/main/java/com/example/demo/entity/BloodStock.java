package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BLOODSTOCK")
public class BloodStock {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
   private int id;
   private String bloodGroup;
   private int noOfUnits ;
   public BloodStock() {}
public BloodStock(int id, String bloodGroup, int noOfUnits) {
	super();
	this.id = id;
	this.bloodGroup = bloodGroup;
	this.noOfUnits = noOfUnits;
}
public BloodStock(String bloodGroup, int noOfUnits) {
	super();
	this.bloodGroup = bloodGroup;
	this.noOfUnits = noOfUnits;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public int getNoOfUnits() {
	return noOfUnits;
}
public void setNoOfUnits(int noOfUnits) {
	this.noOfUnits = noOfUnits;
}
@Override
public String toString() {
	return "BloodStock [id=" + id + ", bloodGroup=" + bloodGroup + ", noOfUnits=" + noOfUnits + "]";
}
   
}
