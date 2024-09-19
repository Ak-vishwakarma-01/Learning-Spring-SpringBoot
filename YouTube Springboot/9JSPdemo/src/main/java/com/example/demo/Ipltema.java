package com.example.demo;

public class Ipltema {
    String teamName;
    int trophies;
    String ownername;
    String temaCaptionname;

    @Override
    public String toString() {
        return "Ipltema{" +
                "teamName='" + teamName + '\'' +
                ", trophies=" + trophies +
                ", ownername='" + ownername + '\'' +
                ", temaCaptionname='" + temaCaptionname + '\'' +
                '}';
    }

    public Ipltema(String teamName, int trophies, String ownername, String temaCaptionname) {
        super();
        this.teamName = teamName;
        this.trophies = trophies;
        this.ownername = ownername;
        this.temaCaptionname = temaCaptionname;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getTemaCaptionname() {
        return temaCaptionname;
    }

    public void setTemaCaptionname(String temaCaptionname) {
        this.temaCaptionname = temaCaptionname;
    }
}
