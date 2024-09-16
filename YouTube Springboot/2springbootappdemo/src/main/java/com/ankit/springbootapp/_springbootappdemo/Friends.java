package com.ankit.springbootapp._springbootappdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class Friends {

    ArrayList<String> frineds;

    @PostConstruct // after servelat dispatcher this will run.
    public void init(){  // when sb start it will run first and do this.
        System.out.println("intit job is doing");
        frineds = new ArrayList<>();
        frineds.add("lelee");
        frineds.add("dede");
    }



    public ArrayList<String> getAllfriineds() {
        return frineds;
    }

    public int getAllfriinedsize() {

        return frineds.size();
    }
    public void addfriend(String name){
        frineds.add(name);
    }
    @PreDestroy  // when object is about to destroy then it will run before
    public void destroY(){
        System.out.println("friends destroyed");
        frineds.clear();
    }

}
