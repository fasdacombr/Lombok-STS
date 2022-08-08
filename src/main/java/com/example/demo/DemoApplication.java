package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Client;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(1L, "Bob");
		Client c2 = new Client(2L, "Nina");
		
		c1.setName("Bob Brow");
		
		System.out.println("ID = " + c1.getId());
		
		if (c1.equals(c2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
