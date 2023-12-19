package com.Group11.TugasBesar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Group11.TugasBesar")
public class GoLivinApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoLivinApplication.class, args);
	}

}
