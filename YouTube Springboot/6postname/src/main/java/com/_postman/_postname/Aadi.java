package com._postman._postname;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Target , Retention, Documented, Controller , ResponseBody
// Inside Controller we have @Component
public class Aadi {

    Aadi(){
        System.out.println("le bhai constructur called"); // if we remove component or rest controller then this will not print means object will not be created by controller.
    }

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String home(){
        return "hello ankit kumar vishwakarma";
    }

    @PostMapping("/lele") // it is to post it doesn't work in browser
    public String lele(){
        return "hello ankit ku vishwakarma";
    }
}
