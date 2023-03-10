package com.samcro.springCourse.Controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import com.samcro.springCourse.Models.Student;

@Controller
@RequestMapping("/")
public class StudentController {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        //create a new student class
        Student newStudent = new Student();

        // //Options list
        // LinkedHashMap<String, String> options = new LinkedHashMap<>();
        // options.put("TR", "Turkiye");
        // options.put("USA", "United States of America");
        // options.put("BR", "Brazil");
        // theModel.addAttribute("options", options);

        //Add this student to the model attribute
        theModel.addAttribute("student", newStudent);
        //return the form.
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student,
    BindingResult theBindingResult, Model theModel){
        if(theBindingResult.hasErrors()){
            return "student-form";
        }

        return "student-confirmation";
    }
    
}
