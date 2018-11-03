package com.st.web.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class MyProfileTestConfig {

	private String mylocation;

	public String getMylocation() {
		return mylocation;
	}

	public void setMylocation(String mylocation) {
		this.mylocation = mylocation;
	}

}
