package com.st.web.resource;

import javax.annotation.Resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ConfigurationProperties
@PropertySource(value = "file:G:\\ApplicationWorkbook\\spring-boot-workspace\\messages.properties")
public class ErrorMessageConfig {

	@Resource
	private Environment env;

	public Environment getEnv() {
		return env;
	}
}
