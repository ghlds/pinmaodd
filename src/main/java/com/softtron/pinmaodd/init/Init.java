package com.softtron.pinmaodd.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ConfigurationProperties
@MapperScan("com.softtron.pinmaodd")
@ComponentScan("com.softtron.pinmaodd")
public class Init{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Init.class, args);
	}

}