package com.example.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.social.bean.SocialData;
import com.example.social.services.SocialService;

@RestController
@RequestMapping(value = "/social")
public class SocialController {

	@Autowired
	SocialService service;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<List<SocialData>> gteSocialLifeData(@PathVariable("id") int id) throws Exception {
		List<SocialData> socialDataList = service.getSocialDetails(id);
		return new ResponseEntity<List<SocialData>>(socialDataList, HttpStatus.OK);
	}
}
