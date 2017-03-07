package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.domain.User1;

@Mapper
public interface User1Mapper {
	//根据姓名查询
	@Select("select * from user1 where name = #{name}")
	public List<User1> likeName(String name);
	
	//根据id查询
	@Select("select * from user1 where id = #{id}")
	public User1 getById(int id);
	
	//根据地址查询
	@Select("select * from user1 where address = #{address}")
	public List<User1> likeAddress(String address);

}
