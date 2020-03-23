package com.example.demo1.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int eid;
	private String ename;
	private String town;
	
	Employee(){
		
	}
	
	public Employee(int eid, String ename, String town) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.town = town;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	
	
}
