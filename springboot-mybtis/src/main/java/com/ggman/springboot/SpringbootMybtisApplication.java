package com.ggman.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.ggman.springboot.mapper")// 自动扫描mapper
@ComponentScan(basePackages= "com.ggman")//添加扫包@ComponentScan(basePackages= "")
@SpringBootApplication
public class SpringbootMybtisApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootMybtisApplication.class, args);
	}

}

