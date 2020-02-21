package com.example.address.services;

import com.example.address.bean.Address;
import com.example.address.bean.JobBean;

public interface AddressService {
	 Address getAddressById(int id) throws Exception;
	 JobBean getJobById(int id);
}
