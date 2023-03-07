package com.example.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstRepositoryProApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRepositoryProApplication.class, args);
		B b = new B();
		b.getMsg();
	}

	public void main8() {}
}
