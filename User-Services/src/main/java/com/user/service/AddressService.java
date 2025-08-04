package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.model.Address;

	
public interface AddressService {

	    public List<Address> getAddressOfUser(Long userId);

	}
