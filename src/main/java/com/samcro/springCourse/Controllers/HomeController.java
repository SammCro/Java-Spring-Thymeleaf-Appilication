package com.samcro.springCourse.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.netty.http.server.HttpServerRequest;



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
    public String processFormVersionTwo(HttpServletRequest request, Model model){
        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();


        model.addAttribute("message", studentName);
        return "processFormVersionTwo";
    }    
}
