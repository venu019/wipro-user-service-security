package com.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Long cId;
 private String email;
 private String contactName;

public Contact(Long cId, String email, String contactName) {
	super();
	this.cId = cId;
	this.email = email;
	this.contactName = contactName;
}

public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getcId() {
	return cId;
}

public void setcId(Long cId) {
	this.cId = cId;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getContactName() {
	return contactName;
}

public void setContactName(String contactName) {
	this.contactName = contactName;
}
 
 
}
