package com.spring.page;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

/**
 * 用于实现分页
 * @author dell
 *
 */
@Configuration
public class Page {
	@Bean
	public PageHelper pageHelper(){
		System.out.println("MyBatisConfiguration.pageHelper()");
		 
		PageHelper pageHelper = new PageHelper();
		 
		Properties p= new Properties();
		 
		p.setProperty("offsetAsPageNum","true");
		 
		p.setProperty("rowBoundsWithCount","true");
		 
		p.setProperty("reasonable","true");
		 
		pageHelper.setProperties(p);
		 
		return pageHelper;
	}

}
