package com.ankit.springbootapp._springbootappdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@RestController
public class FriendsController {
    @Autowired
    Friends friends;

    @GetMapping("/friends")
    public ArrayList<String> getAllfriineds(){
        return friends.getAllfriineds();
    }
    @RequestMapping("/friends/count")
    public int getallfriendsize(){
        return friends.getAllfriinedsize();
    }
    @GetMapping("/friends/add/{name}")
    public ArrayList<String> addFriend(@PathVariable String name){
        friends.addfriend(name);
        return friends.getAllfriineds();
    }
}
