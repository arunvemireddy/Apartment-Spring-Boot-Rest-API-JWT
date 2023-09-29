package com.example.Apartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author ARUN VEMIREDDY
 *
 */
//@SpringBootApplication(scanBasePackages={
//		"com.example.security.services",
//		"com.example.common",
//		"com.example.Apartment.Util",
//		"com.example.Apartment.Entity",
//		"com.example.Apartment.Controller",
//		"com.example.Apartment.Dao",
//		"com.example.Apartment.DTO",
//		"com.example.Apartment.Service",
//		"com.example.Apartment.ServiceImpl",
//		"com.example.security.filter",
//		"com.example.Apartment.Batch"})

@SpringBootApplication(scanBasePackages={
		"com.example"})
@EnableSwagger2
public class ApartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentApplication.class, args);
	}

}
