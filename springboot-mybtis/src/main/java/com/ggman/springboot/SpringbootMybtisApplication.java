package com.ggman.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.ggman.springboot.mapper")// 自动扫描mapper
@SpringBootApplication
public class SpringbootMybtisApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootMybtisApplication.class, args);
	}

}

