package com.jdbc.practice;

public class Person {
	private int id;
	private String fname;
	private String lname;
	private String email;
	public Person(int id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", getId()="
				+ getId() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getEmail()=" + getEmail()
				+ "]";
	}
	

}
