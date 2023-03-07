package com.samcro.springCourse.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello Sam World!");
        return "index";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "processForm";
    }
    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(@RequestParam("studentName") String studentName, Model model){
        studentName = studentName.toUpperCase();

        model.addAttribute("message", studentName);
        return "processFormVersionTwo";
    }    
}
