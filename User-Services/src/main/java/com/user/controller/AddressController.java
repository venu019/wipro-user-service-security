package com.user.controller;

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

import com.user.model.Address;
import com.user.service.AddressServiceImpl;




@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressServiceImpl addressservice;
	 
	
	@GetMapping("/getaddressbyid/{id}")
	public ResponseEntity<Address>  getaddress(Long id){
		return ResponseEntity.ok(addressservice.getAddressOfUser(id));
	}
	
	@PostMapping("/addaddress")
	public ResponseEntity<Address> addaddress(@RequestBody Address contact){
		return ResponseEntity.ok(addressservice.addAddress(contact));
	}
	
	@PutMapping("/updateaddress")
	public ResponseEntity<Address> updateaddress(@RequestBody Address contact){
		return ResponseEntity.ok(addressservice.updateAddress(contact));
	}
	
	@DeleteMapping("/deleteaddress/{id}")
	public ResponseEntity<Void> deleteaddress(@PathVariable Long id){
		addressservice.deleteAddress(id);
		return ResponseEntity.ok().build();
	}

}
