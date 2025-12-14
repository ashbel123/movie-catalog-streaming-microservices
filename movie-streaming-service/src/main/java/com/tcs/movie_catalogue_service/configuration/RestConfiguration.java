package com.tcs.movie_catalogue_service.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {
  
	@LoadBalanced
	@Bean  // rest template used to make http requests to any other service
  public RestTemplate restTemplate() {
	  return new RestTemplate();
	  
  }
}
