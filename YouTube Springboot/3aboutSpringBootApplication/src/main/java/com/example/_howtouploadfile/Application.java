package com.example._howtouploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.DifferentThisScan","com.example._howtouploadfile"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cfg = SpringApplication.run(Application.class, args);
	    // it will ger whatever iside the ioc container
		Student std = cfg.getBean(Student.class);

		System.out.println("id:  "+std.getId());
		System.out.println("Name:  "+std.getName());

		Employee emp = cfg.getBean(Employee.class);
		System.out.println("id :"+emp.getId() + "  name:  "+emp.getName()+ "  address:  "+emp.getAddress());

	}

}
