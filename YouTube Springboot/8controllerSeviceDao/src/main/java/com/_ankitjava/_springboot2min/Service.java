package com._ankitjava._springboot2min;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
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

}
