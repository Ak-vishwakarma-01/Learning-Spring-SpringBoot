package com.ankit.springbootapp._springbootappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*

@Configuration (Spring Core Framework):
This annotation indicates that a class is a source of Spring bean definitions.
It allows you to define beans using Java code, acting like an XML configuration file in traditional Spring.
The class annotated with @Configuration can be used by the Spring container to create and manage beans.

@SpringBootConfiguration (Spring Boot):
This is a specialized version of @Configuration in Spring Boot.
In most cases, it is used by @SpringBootApplication,


@EnableAutoConfiguration (Spring Boot):
This annotation tells Spring Boot to automatically configure your application based on the dependencies present on the classpath.
It simplifies setup by auto-configuring things like web servers (Tomcat), DispatcherServlet, data sources, etc.
For example, if you have spring-boot-starter-web in your classpath, it will configure a web application with an embedded Tomcat server.

ComponentScan (Spring & Spring Boot):
This annotation is used to tell Spring where to look for components, configurations, and services.
It scans the specified package and its sub-packages to discover beans annotated with @Component, @Service, @Repository, or @Controller.
In Spring Boot, it's typically used within the @SpringBootApplication annotation.

@AutoConfiguration (Spring Boot):
This annotation is not a standard annotation in Spring Boot. However, it may refer to custom or meta-annotations based on @EnableAutoConfiguration.


 */
@SpringBootApplication  // instead of all above use this single one
public class Application {

	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication(Application.class);
		SpringApplication.run(Ankit.class,args);
//		ConfigurableApplicationContext container = springApplication.run(); // It is used to get/make the object
//		Student student = container.getBean(Student.class);
//	    System.out.println(student);
//		System.out.println("student name:  "+student.getStudentName());
		
		
	}
//	@Bean         // use to create object manually but push into container
//	public Student createObj() {
//		return new Student();
//	}
}
