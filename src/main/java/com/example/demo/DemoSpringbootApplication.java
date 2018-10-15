package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoSpringbootApplication extends SpringBootServletInitializer  {

	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DemoSpringbootApplication.class);
	    }
	 
	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(DemoSpringbootApplication.class, args);
}
}