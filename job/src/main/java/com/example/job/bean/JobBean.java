package com.example.job.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class JobBean {

	private int id;
	private String title;
	private String company;
	private String year;
}
