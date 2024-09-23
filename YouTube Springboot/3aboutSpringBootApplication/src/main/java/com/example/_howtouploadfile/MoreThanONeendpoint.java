package com.example._howtouploadfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MoreThanONeendpoint {

    @GetMapping({"/","/list","/student","/studenlist"})
    public List<Student> home(){
        return list;
    }
    List<Student> list = new ArrayList<Student>(Arrays.asList(new Student(2134,"this is more than one Student")));
}
