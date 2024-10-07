package com.springsecurity.springSecurity;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String home(){
        return "home"; // html page
    }

    @GetMapping("/admin/home")
    public String handleAdmin(){
        return "admin_home"; // html page
    }

    @GetMapping("/user/home")
    public String handleUser(){
        return "user_home"; // html page
    }

}