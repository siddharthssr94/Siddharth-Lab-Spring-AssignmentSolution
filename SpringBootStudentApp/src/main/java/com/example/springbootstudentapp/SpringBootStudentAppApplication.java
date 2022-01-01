package com.example.springbootstudentapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudentAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring Application Started");
		
	}
}
