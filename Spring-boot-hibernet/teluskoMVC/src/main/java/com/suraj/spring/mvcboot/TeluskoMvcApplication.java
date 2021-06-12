package com.suraj.spring.mvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Spring Boot App will have Embedded Tomcat
//when we type localhost:8080 it will send req to controller and that is DispatcherServlet which will send to controller


@SpringBootApplication
public class TeluskoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoMvcApplication.class, args);
	}

}
