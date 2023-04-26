package com.example.snehaladminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.example.snehaladminservice")

public class SnehalAdminserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnehalAdminserviceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
