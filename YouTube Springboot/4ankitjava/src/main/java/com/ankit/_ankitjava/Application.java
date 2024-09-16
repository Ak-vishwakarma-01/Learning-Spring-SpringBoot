package com.ankit._ankitjava;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("/hello/application.properties") // application.properties not in resources then we have to mention here that where it is
// but if it is inside config of resourse or anywhere inside direct project file then we don't need to add this annotation
// and you can add config also anywhere inside dierct folder of project
// and the name of teh appliction.properties should be application.properties
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		MyApp app = container.getBean(MyApp.class); // Bean means object
		System.out.println(app.getAppName());
		System.out.println(app.getAppVersion());
	}

}
