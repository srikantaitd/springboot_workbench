package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.resource.PlaceholderConfig;

@RestController
@SpringBootApplication
public class Application {

	@Autowired
	PlaceholderConfig props;

	@Autowired
	Environment env;

	@RequestMapping("/db")
	String env() {
		System.out.println(props.getDescription());
		return props.getDescription();
	}

	@RequestMapping("/env")
	String home() {
		System.out.println(env.getProperty("description"));
		return env.getProperty("description");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
