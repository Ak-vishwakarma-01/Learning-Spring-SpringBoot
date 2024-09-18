package com._ankitjava._springboot2min;

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
        pst.setString(1,captainName);
        pst.setString(2,teamName);
        pst.executeUpdate();

        return "Update Successful";
    }
}
