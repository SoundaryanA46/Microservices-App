package com.microservielearn.depart_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartServiceApplication.class, args);
	}

}
