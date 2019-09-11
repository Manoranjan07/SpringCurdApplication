package com.sca.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sca.*" })
@EntityScan(basePackages = { "com.sca.entities" })
@EnableJpaRepositories("com.sca.repository")
public class SpringCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCurdApplication.class, args);
	}
}
