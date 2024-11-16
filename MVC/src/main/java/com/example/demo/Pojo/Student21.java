package com.example.demo.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student21")
public class Student21 {
	@Id
	int roll;
	String name;
	String section;
	String email;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student21 [roll=" + roll + ", name=" + name + ", section=" + section + ", email=" + email + "]";
	}
	public Student21(int roll, String name, String section, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.section = section;
		this.email = email;
	}
	public Student21() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}