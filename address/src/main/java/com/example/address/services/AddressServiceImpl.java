package com.example.address.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.address.bean.Address;
import com.example.address.bean.JobBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	RestTemplate template;
	
	static List<Address> addressList = new ArrayList<>();
	
	static {
		Address vedAddress = new Address();
		vedAddress.setDist("Saran");
		vedAddress.setId(12);
		vedAddress.setPin(560100l);
		vedAddress.setPo("Jagarnathpur");
		vedAddress.setThana("Bheldi");
		vedAddress.setState("Bihar");
		vedAddress.setVillage("Jagarnathpur");
		addressList.add(vedAddress);
	}
	
	@Override
	public Address getAddressById(int id) throws Exception {
		Optional<Address> address = addressList.stream().filter(add -> add.getId() == id).findFirst();
		if(address.isPresent()) {
			Address adr =  address.get();
			adr.setJob(getJobById(id));
			return adr;
		}
		else
			throw new Exception("Invalid Id, Could not able to find any address for given id :" + id);
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "getDefaultJob")
	public JobBean getJobById(int id) {
		JobBean job =  template.getForObject("http://localhost:8086/job/"+id, JobBean.class);
		return job;
	}
	
	public JobBean getDefaultJob(int id) {
		JobBean job = new JobBean();
		job.setId(1);
		job.setTitle("Default_Company");
		job.setYear("2016");
		return job;
	}

}
