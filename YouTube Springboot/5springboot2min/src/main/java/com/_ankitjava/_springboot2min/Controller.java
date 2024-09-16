package com._ankitjava._springboot2min;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/iplteams")
    public String[] home(){
        String []str = {"mi","sdf","lel","csk"};
        return str;
    }
    // If we are sending data from server to spring then we need to use @pathVariable(use to bind client argument to your method parameter).
    @GetMapping("/teaminfo/{teamname}")
    public ArrayList<Ipltema> teamIpl(@PathVariable String teamname){
        ArrayList<Ipltema> list = new ArrayList<>();
        System.out.println("Team name is: "+teamname);
        switch (teamname){
            case "mi":
                list.add(new Ipltema("MI",5,"ambain","Rohitsharma"));
                return list;
            case "csk":
                list.add(new Ipltema("csk",5,"ambain","Rohitsharma"));
                return list;
            case "bang":
                list.add(new Ipltema("kkr",5,"ambain","Rohitsharma"));
                return list;
            default:
                return list;
        }
    }
}
