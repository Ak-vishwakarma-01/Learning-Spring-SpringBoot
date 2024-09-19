package com.example.demo;

import com.mysql.cj.jdbc.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Dao {



    public List<Ipltema> getIplTeam() throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.DBconnect();
        Statement stmt = con.createStatement();
        ResultSet rs= stmt.executeQuery("select * from ipl");
        List<Ipltema> list = new ArrayList<>();
        while(rs.next()){
            String name = rs.getString("name");
            int tr = rs.getInt("trophies");
            String ownr = rs.getString("ownername");
            String cap = rs.getString("captainname");
            Ipltema ipl = new Ipltema(name,tr,ownr,cap);
            list.add(ipl);
        }
        return  list;
    }

//    public String insertIplteam() throws SQLException, ClassNotFoundException {
//        Connection con = DBConnection.DBconnect();
//        PreparedStatement stmt = con.createStatement("INSERT INTO ipl (name, trophies, ownername, captainname) VALUES (?, ?, ?, ?)");
//
//        return "Data has been inserted";
//    }

    public String update(String captainName, String teamName) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.DBconnect();
        PreparedStatement pst = con.prepareStatement("UPDATE ipl SET captainname = ? WHERE name = ?");
        System.out.println(captainName+"   "+teamName);
        pst.setString(1,captainName);
        pst.setString(2,teamName);
        pst.executeUpdate();

        return "Update Successful";
    }

    public String updateAll(Ipltema newteam) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.DBconnect();
        PreparedStatement pst = con.prepareStatement("UPDATE ipl SET captainname = ?, ownername = ?, trophies = ? WHERE name = ?");
        pst.setString(1,newteam.getTemaCaptionname());
        pst.setString(2,newteam.getOwnername());
        pst.setInt(3,newteam.getTrophies());
        pst.setString(4,newteam.getTeamName());
        pst.executeUpdate();

        return "Update Successful";
    }

    public String deleteam( String teamName) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.DBconnect();
        PreparedStatement pst = con.prepareStatement("delete from ipl where name = ?");
        pst.setString(1,teamName);
        pst.executeUpdate();

        return "the team has bean deleted";
    }

    public Ipltema getByTeamName(String teamName) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.DBconnect();
        PreparedStatement pst = con.prepareStatement("select * from ipl where name = ?");
        pst.setString(1, teamName);
        ResultSet rs = pst.executeQuery();
        Ipltema iplteams = null;
        while (rs.next()) {
            iplteams = new Ipltema(rs.getString("name"), rs.getInt("trophies"), rs.getString("ownername"), rs.getString("captainname"));
            rs.next();
        }
        return iplteams;
    }
}
