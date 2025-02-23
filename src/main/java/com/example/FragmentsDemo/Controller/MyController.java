package com.example.FragmentsDemo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/home/")
    public String home(){
        return "home";
    }

    @GetMapping("/gallery/")
    public String gallery(){
        return "gallery";
    }

    @GetMapping("/contact/")
    public String contact(){
        return "contact";
    }

    @GetMapping("/signup/")
    public String signup(){
        return "signup";
    }







}
