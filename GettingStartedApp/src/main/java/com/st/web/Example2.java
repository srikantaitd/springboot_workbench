package com.st.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example2 {
	@RequestMapping("/home")
	String home() { 
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example2.class, args);
	}
}
