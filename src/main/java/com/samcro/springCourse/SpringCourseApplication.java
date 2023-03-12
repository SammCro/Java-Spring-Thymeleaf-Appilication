package com.samcro.springCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class SpringCourseApplication {

	public static void main(String[] args) {		
		SpringApplication.run(SpringCourseApplication.class, args);
	}

}
