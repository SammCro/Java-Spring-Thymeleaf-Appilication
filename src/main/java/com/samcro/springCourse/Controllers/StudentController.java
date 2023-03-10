package com.samcro.springCourse.Controllers;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.samcro.springCourse.Models.Student;

@Controller
@RequestMapping("/")
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        //create a new student class
        Student newStudent = new Student();
        //Options list
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        options.put("TR", "Turkiye");
        options.put("USA", "United States of America");
        options.put("BR", "Brazil");

        theModel.addAttribute("options", options);
        //Add this student to the model attribute
        theModel.addAttribute("student", newStudent);
        //return the form.
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }
    
}
