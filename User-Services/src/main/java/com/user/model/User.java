package com.user.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String name;
	private String phone;
	@ManyToOne  
    @JoinColumn(name = "cId") 
	private Contact contact;
	@ManyToOne  
    @JoinColumn(name = "id") 
	private Address address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId, String name, String phone, Contact contact, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
		this.address = address;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
