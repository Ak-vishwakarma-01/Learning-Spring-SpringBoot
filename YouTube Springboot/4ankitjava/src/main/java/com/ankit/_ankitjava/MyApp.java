package com.ankit._ankitjava;

import org.springframework.stereotype.Component;

@Component  // object of this class created by default by sb in container
public class MyApp {
    String appName;
    String appVersion;
    String description;
    public MyApp(String appName, String appVersion, String description){
        super();
        this.appName = appName;
        this.appVersion = appVersion;
        this.description = description;
    }

    public MyApp(){
        super();
    }
    
}
