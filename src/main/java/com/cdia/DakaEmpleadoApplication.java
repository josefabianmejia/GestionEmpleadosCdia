package com.cdia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:DatasourceConsorcio.properties")
public class DakaEmpleadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DakaEmpleadoApplication.class, args);
	}
}
