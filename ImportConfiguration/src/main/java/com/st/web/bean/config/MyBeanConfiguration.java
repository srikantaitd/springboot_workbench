package com.st.web.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.st.web.bean.MyPropertiesBean;

@Configuration
public class MyBeanConfiguration {

	@Bean
	public MyPropertiesBean myProp() {
		MyPropertiesBean myProp = new MyPropertiesBean();
		myProp.setName("I am spring bean by java configuration");
		return myProp;
	}
}
