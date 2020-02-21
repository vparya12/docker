package com.example.home.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.home.bean.Address;
import com.example.home.bean.SocialData;
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	RestTemplate template;
	
	@Override
	public Address getAddress(int id) {
		return template.getForObject("http://localhost:8085/address/"+id, Address.class);
	}

	@Override
	public SocialData[] getSocialMediaInfo(int id) {
		return template.getForObject("http://localhost:8087/social/"+id, SocialData[].class);
	}
}
