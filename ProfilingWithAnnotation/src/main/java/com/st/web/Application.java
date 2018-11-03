package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.resource.AppConfiguration;
import com.st.web.resource.ProductionConfig;

@RestController
@SpringBootApplication
public class Application {

	@Autowired
	AppConfiguration appConfig;

	@RequestMapping("/db")
	String home() {
		System.out.println(appConfig.getMylocation());
		return appConfig.getMylocation();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
