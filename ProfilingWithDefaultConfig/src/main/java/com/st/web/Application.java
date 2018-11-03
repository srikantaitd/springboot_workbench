package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.resource.MyProfileTestConfig;

@RestController
@SpringBootApplication
public class Application {

	@Autowired
	MyProfileTestConfig props;

	@RequestMapping("/db")
	String home() {
		System.out.println(props.getMylocation());
		return props.getMylocation();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
