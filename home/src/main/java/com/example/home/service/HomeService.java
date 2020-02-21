package com.example.home.service;


import com.example.home.bean.Address;
import com.example.home.bean.SocialData;

public interface HomeService {

	Address getAddress(int id);
	SocialData[] getSocialMediaInfo(int id);
}
