package com.virtusa.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach=context.getBean("MyCoach",Coach.class);
		System.out.println("\nSport : "+theCoach.getName());
		System.out.println("\nDaily Workout : "+theCoach.getDailyWorkout());
		System.out.println("\nDiet : "+theCoach.getDiet());

		context.close();
	}

}
