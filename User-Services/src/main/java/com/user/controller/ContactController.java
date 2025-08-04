package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Contact;
import com.user.service.ContactServiceImpl;



@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactServiceImpl contactservice;
	 
	
	@GetMapping("/getcontactbyid/{id}")
	public ResponseEntity<Contact>  getcontact(Long id){
		return ResponseEntity.ok(contactservice.getcontactOfUser(id));
	}
	
	@PostMapping("/addcontact")
	public ResponseEntity<Contact> addcontact(@RequestBody Contact contact){
		return ResponseEntity.ok(contactservice.addContact(contact));
	}
	
	@PutMapping("/updatecontact")
	public ResponseEntity<Contact> updatecontact(@RequestBody Contact contact){
		return ResponseEntity.ok(contactservice.updatecontact(contact));
	}
	
	@DeleteMapping("/deletecontact/{id}")
	public ResponseEntity<Void> deletecontact(@PathVariable Long id){
		contactservice.deletecontact(id);
		return ResponseEntity.ok().build();
	}

}
