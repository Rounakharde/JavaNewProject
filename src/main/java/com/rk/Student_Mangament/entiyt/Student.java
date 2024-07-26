package com.rk.Student_Mangament.entiyt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_id")
	private int id;
	@Column(name="frist_name")
	private String fristname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="city")
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String fristname, String lastname, String email, String city) {
		super();
		this.id = id;
		this.fristname = fristname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	

}
