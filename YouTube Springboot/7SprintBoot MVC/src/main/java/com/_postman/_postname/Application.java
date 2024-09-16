package com._postman._postname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication // @ComponentScan will scan all the classes in this package
//autoconfiguration ,
//enableautoconfiguration( to start tomcat and dispacher servlate),
// conponentscan(It is use to scan the packages(outside package also but inside the project)) if we make a class component then it becomes the part of spring container
@ComponentScans(@ComponentScan({"com.Test","com._postman._postname","com.check"})) // now this will scan only given packages
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
