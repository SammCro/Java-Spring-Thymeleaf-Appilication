package com.samcro.springCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.samcro.springCourse.Models.Student;
import com.samcro.springCourse.Services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class SpringCourseApplication {

	public static void main(String[] args) {		
		StudentService studentService = new StudentService();

		Student student = new Student();
		student.setFirstName("Sam");
		student.setLastName("Cro");
		student.setEmail("ilk.samett06@gmail.com");
		studentService.saveStudent(student);
		
		SpringApplication.run(SpringCourseApplication.class, args);
	}

}
