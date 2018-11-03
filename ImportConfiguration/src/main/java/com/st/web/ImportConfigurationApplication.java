package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.bean.MyPropertiesBean;
import com.st.web.bean.config.MyBeanConfiguration;

@RestController
@SpringBootApplication
@Import(value = { MyBeanConfiguration.class })
public class ImportConfigurationApplication {

	@Autowired
	MyPropertiesBean myProp;

	@RequestMapping("/home")
	String home() {
		return myProp.getName();
	}

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ImportConfigurationApplication.class, args);
	}

}
