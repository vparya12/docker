package com.example.home.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

	private int id;
	private String village;
	private String po;
	private String thana;
	private String dist;
	private String state;
	private long pin;
	private JobBean job;
	
}
