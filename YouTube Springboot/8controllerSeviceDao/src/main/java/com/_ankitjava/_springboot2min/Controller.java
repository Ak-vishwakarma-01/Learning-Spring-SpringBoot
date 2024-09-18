package com._ankitjava._springboot2min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
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
}
