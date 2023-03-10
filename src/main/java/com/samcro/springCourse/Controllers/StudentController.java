package com.samcro.springCourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samcro.springCourse.Models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
    public void showStudent(@ModelAttribute Student theStudent){
        
    }
}
