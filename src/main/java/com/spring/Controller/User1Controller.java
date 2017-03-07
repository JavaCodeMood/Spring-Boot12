package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.User1;
import com.spring.service.User1Service;

@RestController

public class User1Controller {
	@Autowired
	private User1Service user1Service;
	
	@RequestMapping("/likeName/{name}")
	public List likeName(@PathVariable("name")String name){
		//PageHelper.startPage(1,1);
		//System.out.println(name);
		return user1Service.likeName(name);
	}
	
	@RequestMapping("/likeAddress/{address}")
	public List likeAddress(@PathVariable("address")String address){
		//PageHelper.startPage(1,1);
		//System.out.println(address);
		return user1Service.likeAddress(address);
	}
	
	@RequestMapping("/{id}")
	public User1 getById(@PathVariable("id")int id){
		//PageHelper.startPage(1,1);
		//System.out.println(id);
		return user1Service.getById(id);
	}

}
