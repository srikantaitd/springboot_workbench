package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.bean.MyPropertiesBean;

@RestController
@SpringBootApplication
@ImportResource(locations= {"classpath:applicationContext.xml"})
public class ImportResourceXMLApplication {
	
	@Autowired
	MyPropertiesBean myProp;
	
	@RequestMapping("/home")
	String home() {
		return myProp.getName();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ImportResourceXMLApplication.class, args);
	}
	
}
