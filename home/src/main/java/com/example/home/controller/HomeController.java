package com.example.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.home.bean.Address;
import com.example.home.bean.SocialData;
import com.example.home.service.HomeService;

@RestController
@RequestMapping(value = "/welcome")
public class HomeController {

	@Autowired
	HomeService service;
	
	@GetMapping(value = "/home")
	public String welcome() {
		String defaultMsg = "Welcome to Home <b> Ved Prakash Arya </b>";
		Address add = service.getAddress(12);
		return defaultMsg+add;
	}
	@GetMapping(value = "/social/{id}")
	public SocialData[] getSocialInfo(@PathVariable("id")int id) {
		return service.getSocialMediaInfo(id);
	}
}
