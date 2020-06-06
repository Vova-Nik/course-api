package io.javabrains.springbootquickstart.courseapi;
//io.javabrains.springbootquickstart.courseapi.controllers

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaBrainsCourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrainsCourseApiApplication.class, args);
		System.out.println("JavaBrainsCourseApiApplication");
		//ApplicationContext context = new AnnotationConfigApplicationContext("io.javabrains.springbootquickstart.courseapi.service");

	}


}
