package com.MobileApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Table(name="mobileapplication")
@Entity
public class MobileApplication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String name;
private float rateUs;
private long users;
 private String size;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getRateUs() {
	return rateUs;
}
public void setRateUs(float rateUs) {
	this.rateUs = rateUs;
}
public long getUsers() {
	return users;
}
public void setUsers(long users) {
	this.users = users;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
}
