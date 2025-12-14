package com.tcs.movie_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieGatewayApplication.class, args);
	}

}
