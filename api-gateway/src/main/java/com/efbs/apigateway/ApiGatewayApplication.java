package com.efbs.apigateway;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.efbs.apigateway.filters.ErrorFilter;
import com.efbs.apigateway.filters.PostFilter;
import com.efbs.apigateway.filters.PreFilter;
import com.efbs.apigateway.filters.RouteFilter;

import brave.sampler.Sampler;

@EnableZuulProxy //act as Zuul proxy
@EnableEurekaServer//for making this application as eureka server
@SpringBootApplication
public class ApiGatewayApplication {

	private static final Logger LOG = Logger.getLogger(ApiGatewayApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);

		System.err.println("Zuul API gatway server is calling");
		LOG.log(Level.INFO, "Zuul API gatway server is calling");
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
