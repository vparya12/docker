package com.example.social.services;

import java.util.List;

import com.example.social.bean.SocialData;

public interface SocialService {

	List<SocialData> getSocialDetails(int id) throws Exception;
}
