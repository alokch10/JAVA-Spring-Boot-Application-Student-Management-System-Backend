package com.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	@Id
	 private int id;
	 private String classname;
	 private String name;
	 private int roll;
	 private String address;
	 private int phone;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Student(int id, String classname, String name, int roll, String address, int phone) {
		super();
		this.id = id;
		this.classname = classname;
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", classname=" + classname + ", name=" + name + ", roll=" + roll + ", address="
				+ address + ", phone=" + phone + "]";
	}
	 
	
	
}
