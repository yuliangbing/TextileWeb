package com.technology.textile.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages="com.technology.textile.web.mapper")
@SpringBootApplication
public class TextileWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextileWebApplication.class, args);
	}

}
