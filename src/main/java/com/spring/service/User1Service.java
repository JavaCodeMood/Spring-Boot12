package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.User1;
import com.spring.mapper.User1Mapper;

@Service
public class User1Service {
	@Autowired
	private User1Mapper user1Mapper;
	
	public List likeName(String name){
		return user1Mapper.likeName(name);
	}
	
	public List likeAddress(String address){
		return user1Mapper.likeAddress(address);
	}
	
	public User1 getById(int id){
		return user1Mapper.getById(id);
	}

}
