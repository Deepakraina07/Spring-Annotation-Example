package com.spring.SpringAnnotationExample;

import java.beans.beancontext.BeanContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringAnnotationExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationExampleApplication.class, args);
		ApplicationContext factory = new AnnotationConfigApplicationContext(SchoolConfiq.class);
		School school = factory.getBean("school",School.class);
		System.out.println("School Object is created Successfully: "+ school);
		school.test();
		
	}

}
