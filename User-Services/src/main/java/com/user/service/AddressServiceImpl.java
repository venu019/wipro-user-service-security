package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Address;
import com.user.repository.AddressRepository;

@Service
public class AddressServiceImpl {
	
	@Autowired
	private AddressRepository repo;
	
	public Address getAddressOfUser(Long id) {
	    return repo.findById(id).orElse(null);
	}
	
	public Address addAddress(Address address) {
		return repo.save(address);
	}
	
	public Address updateAddress(Address address) {
		return repo.save(address);
	}
	
	public void deleteAddress(Long id) {
		repo.deleteById(id);
	}


}
