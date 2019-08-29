package com.example.SpringDataJPAMySqlOneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages={"com.example.model"})
@ComponentScan(basePackages= {"com.example"})
@EnableJpaRepositories("com.example.Repository")
public class SpringDataJpaMySqlOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMySqlOneToManyApplication.class, args);
	}

}
