package com.example.spring_auth_demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudnetProfileController {

    @GetMapping(value = "/profile")
    public String getStudentProfile(Model model){
        return  "studentProfile";
    }
}
