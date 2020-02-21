package com.example.job.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.job.bean.JobBean;

@RestController
@RequestMapping(value = "/job")
public class JobController {

	@GetMapping(value = "/{id}")
	public ResponseEntity<JobBean> getJobById(@PathVariable("id") int id){
		JobBean job = new JobBean();
		job.setId(12);
		job.setCompany("Marlabs");
		job.setTitle("Senior Software Engineer");
		job.setYear("2019");
		ResponseEntity<JobBean> response = new ResponseEntity<JobBean>(job, HttpStatus.OK);
		return response;
	}
}
