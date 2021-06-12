package com.suraj.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeluskoOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TeluskoOneApplication.class, args);
		
		hacker noobHacker = context.getBean(hacker.class); //here we are not creating object and this is called dependecy injection
		noobHacker.quote();
	}

}






/*
 * Spring MVC
 * 
 * Client needs Data in Neat format
 * MVC= model View Controller
 * model - It will hold the Data
 * view -  is for view
 * Controller - accept the Request and will send the Response
 * in situation One Servlet can act as Single Action Controller
 * 
 * 
 * We have Front Controller Covering Main Controller 
 * This Front Controller will share The tasks to actual(Normal) Controller
 * This Front Controller is Nothing But Dispatcher Servlet
 * with Spring Boot it is somewhat automated by Framework Only
 * 
 * 
 * If we tend to use Spring MVC we got 2 options
 * 1. Spring MVC Application
 * 2. Spring Boot MVC app -- this is quite good in sense as it is less configuration
 * 
 * */




