package com.example.ecoLink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = {"controller","dto","dao","service"})
@MapperScan(basePackages = {"controller","dto","dao","service"})
public class EcoLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoLinkApplication.class, args);
	}

}
