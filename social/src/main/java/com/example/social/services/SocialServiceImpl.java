package com.example.social.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.social.bean.SocialData;

@Service
public class SocialServiceImpl implements SocialService {

	static List<SocialData> socialDataList = new ArrayList<>();
	static {
		SocialData facebook = new SocialData();
		SocialData linkedIn = new SocialData();
		SocialData email = new SocialData();
		SocialData hackerRank = new SocialData();
		SocialData geekForGeek = new SocialData();
		SocialData github = new SocialData();
		
		facebook.setId(12);
		facebook.setPlatform("Facebook");
		facebook.setUrl("https://facebook.com/vparya02");
		
		linkedIn.setId(12);
		linkedIn.setPlatform("LinkedIn");
		linkedIn.setUrl("https://www.linkedin.com/in/vparya12/");
		
		email.setId(12);
		email.setPlatform("Gmail");
		email.setUrl("vparya12@gmail.com");
		
		hackerRank.setId(12);
		hackerRank.setPlatform("HackerRank");
		hackerRank.setUrl("https://www.hackerrank.com/vparya12");
		
		geekForGeek.setId(12);
		geekForGeek.setPlatform("GeekForGeek");
		geekForGeek.setUrl("https://auth.geeksforgeeks.org/user/vparya12");
		
		github.setId(12);
		github.setPlatform("Github");
		github.setUrl("https://github.com/vparya12");
		
		socialDataList.add(facebook);
		socialDataList.add(linkedIn);
		socialDataList.add(email);
		socialDataList.add(hackerRank);
		socialDataList.add(geekForGeek);
		socialDataList.add(github);
		
	}
	
	@Override
	public List<SocialData> getSocialDetails(int id) throws Exception{
		if(id == 12)
		return socialDataList;
		else
			throw new Exception("Invalid Id, Please try for valid Id");
	}

}
