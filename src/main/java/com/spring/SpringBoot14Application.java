package com.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.*.mapper")
/*
MapperScan注解，会扫描该包下的接口。
这里我们使用注解的方式进行使用MyBatis，当然您也可以使用xml文件的方式进行使用。
*/
public class SpringBoot14Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot14Application.class, args);
	}
}

/**
1.http://localhost:8080/2
2.http://localhost:8080/likeName/admin/
3.http://localhost:8080/likeAddress/beijing
*/