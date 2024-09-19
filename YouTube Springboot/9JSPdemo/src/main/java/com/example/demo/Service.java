package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.List;

@org.springframework.stereotype.Service // this annotation wiil say that this class is sevice class
public class Service {
    @Autowired // springboot make object of this
    Dao dao;
    public List<Ipltema> getIplTeam() throws SQLException, ClassNotFoundException {
        return dao.getIplTeam();
    }

//    public String InsetIntoteam() throws ClassNotFoundException, SQLException{
//        return  dao.insertIplteam();
//    }

    public  String updateteam(String captinoName, String teamName) throws SQLException, ClassNotFoundException {
        return dao.update(captinoName,teamName);
    }

    public  String updateallteam(Ipltema newteam) throws SQLException, ClassNotFoundException {
        return dao.updateAll(newteam);
    }

    public  String dleteateam(String teamname) throws SQLException, ClassNotFoundException {
        return dao.deleteam(teamname);
    }

    public Ipltema getiplteambyteamname(String teamname) throws SQLException, ClassNotFoundException {
        return dao.getByTeamName(teamname);
    }

}
