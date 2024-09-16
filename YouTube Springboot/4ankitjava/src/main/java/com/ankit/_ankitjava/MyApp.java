package com.ankit._ankitjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// This annotation indicates that Spring will create an object of this class and manage it within the application context.
@Component  // object of this class created by default by sb in container
/*
 Spring Boot creates an object of the class `MyApp` using the Spring container,
 which is known as the ApplicationContext or WebApplicationContext.
 */
public class MyApp {

    @Value("SpringBootapp")
    String appName;
    @Value("${myapp.version}")
    String appVersion;
    String description;
    public MyApp(String appName, String appVersion, String description) {
        super();
        this.appName = appName;
        this.appVersion = appVersion;
        this.description = description;
    }

    public MyApp() {
        super();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
