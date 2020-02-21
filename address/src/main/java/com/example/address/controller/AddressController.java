package com.example.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.address.bean.Address;
import com.example.address.services.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

	@Autowired
	AddressService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Address> welcome(@PathVariable("id") int id) throws Exception{
		Address address = service.getAddressById(id);
		ResponseEntity<Address> response = new ResponseEntity<>(address, HttpStatus.OK);
		return response;
	}
}
