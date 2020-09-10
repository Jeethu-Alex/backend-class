package com.example.backendclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackendClassApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendClassApplication.class, args);
	}

}
