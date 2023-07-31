package com.info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stu")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="School_Name")
	private String schoolName;
	
	public Student(int id, String name, String email, String schoolName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.schoolName = schoolName;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", schoolName=" + schoolName + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	

}
