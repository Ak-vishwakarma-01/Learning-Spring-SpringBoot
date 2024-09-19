package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//@RestController //It is use to return the data in the form of json (to use rest api)
@org.springframework.stereotype.Controller // this is use to send view page
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/iplteams")
    public String iplteams(org.springframework.ui.Model model) throws SQLException, ClassNotFoundException {
        model.addAttribute("iplteams",service.getIplTeam());
        return "iplteams"; // this will be resolved to /WEB-INF/jsp/iplteams.jsp
    }

    //    @PostMapping("/addvalues")
//    public String addTeam() throws ClassNotFoundException, SQLException {
//        return  service.InsetIntoteam();
//    }



    @PutMapping("/iplteams/{Captionname}/{teamName}")
    public String updateCaption(@PathVariable  String Captionname,@PathVariable String teamName) throws SQLException, ClassNotFoundException {
        return  service.updateteam(Captionname,teamName);
    }

    @PutMapping("/iplteams")
    public String updateallteam(@RequestBody Ipltema iplnewteam) throws SQLException, ClassNotFoundException { // new we will send json data to put
        return  service.updateallteam(iplnewteam);
    }

    @DeleteMapping("iplteams/{teamName}")
    public  String deleteTeambyName( @PathVariable  String teamName) throws SQLException, ClassNotFoundException {
        return service.dleteateam(teamName);
    }

    // The issue arises because you're using a combination of a Spring @Controller and view resolution with JSP (for /iplteams), but expecting JSON responses (like for /iplteams/{teamname}). The Spring @Controller is meant to return view pages (like JSPs), whereas the @RestController is used to return JSON directly.

    @GetMapping("/iplteams/{teamname}")
    @ResponseBody //If you want to return JSON from a specific method in a @Controller, annotate that method with @ResponseBody. This tells Spring to serialize the object to JSON instead of resolving it as a view.
    public Ipltema getByTeamname(@PathVariable String teamname) throws SQLException, ClassNotFoundException {
        return service.getiplteambyteamname(teamname);
    }

}
