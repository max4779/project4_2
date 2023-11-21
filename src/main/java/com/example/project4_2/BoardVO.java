package com.example.project4_2;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String name;
	private int phone_number;
	private String email;
	private String address;
	private String college;
	private String department;
	private String hobby;
	private String religion;
	private String favorite_food;
	private String favorite_juice;
	private Date regdate;
	private int cnt;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {	return phone_number;}

	public void setNumber(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {	return email;}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {	return address;}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollege() {	return college;}

	public void setCollege(String college) {
		this.college= college;
	}
	public String getDepartment() {	return department;}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getHobby() {	return hobby;}

	public void setHobby(String hobby) {
		this.hobby =hobby;
	}
	public String getReligion() {	return religion;}
	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setFood(String favorite_food) {
		this.favorite_food = favorite_food;
	}
	public String getFood() {	return favorite_food;}


	public String getJuice() {	return favorite_juice;}

	public void setJuice(String favorite_juice) {
		this.favorite_juice = favorite_juice;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}