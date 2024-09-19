package com._ankitjava._springboot2min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController //It is use to return the data in the form of json
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/iplteams")
    public List<Ipltema> iplteams() throws SQLException, ClassNotFoundException {
        List<Ipltema>  lele = service. getIplTeam();
        return  lele;
    }

//    @PostMapping("/addvalues")
//    public String addTeam() throws ClassNotFoundException, SQLException {
//        return  service.InsetIntoteam();
//    }
//
    @PutMapping("/iplteams/{Captionname}/{teamName}")
    public String updateCaption(@PathVariable  String Captionname,@PathVariable String teamName) throws SQLException, ClassNotFoundException {
        return  service.updateteam(Captionname,teamName);
    }

    @PutMapping("/iplteams")
    public String updateallteam(@RequestBody Ipltema iplnewteam) throws SQLException, ClassNotFoundException { // new we will send json data to put
        return  service.updateallteam(iplnewteam);
    }
}
