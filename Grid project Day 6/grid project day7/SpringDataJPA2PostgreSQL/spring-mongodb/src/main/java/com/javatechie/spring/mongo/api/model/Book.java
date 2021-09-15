package com.javatechie.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document


public class Book {
	
	private int id;
	private String bookname;
	private String authorname;
	public String getId1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId2() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId3() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId4() {
		// TODO Auto-generated method stub
		return null;
	}
	}


