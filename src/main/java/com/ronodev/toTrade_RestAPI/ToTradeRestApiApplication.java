package com.ronodev.toTrade_RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.ronodev.toTrade_RestAPI.Model")
@EnableJpaRepositories("com.ronodev.toTrade_RestAPI.Repository")

public class ToTradeRestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToTradeRestApiApplication.class, args);
	}
}
