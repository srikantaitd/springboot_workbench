package com.st.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.web.resource.DatasourceConfig;
import com.st.web.resource.EmailConfig;
import com.st.web.resource.ErrorMessageConfig;

@RestController
@SpringBootApplication
public class Application {

	@Autowired
	DatasourceConfig props;

	@Autowired
	EmailConfig emailProps;

	@Autowired
	ErrorMessageConfig errConfig;

	@RequestMapping("/db")
	String home() {
		System.out.println(errConfig.getEnv().getProperty("4498"));
		System.out.println(props);
		System.out.println(props.getOrausername() + "\t" + props.getPassword() + "\t" + props.getUrl() + "\t"
				+ props.getDriverClassName());
		return props.getOrausername() + "\t" + props.getPassword() + "\t" + props.getUrl() + "\t"
				+ props.getDriverClassName();
	}

	@RequestMapping("/email")
	String email() {
		System.out.println(emailProps);
		return emailProps.getFrom();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
