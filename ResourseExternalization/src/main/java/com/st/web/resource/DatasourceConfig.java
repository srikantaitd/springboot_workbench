package com.st.web.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource(value = "file:G:\\ApplicationWorkbook\\spring-boot-workspace\\database.properties")
public class DatasourceConfig {
	private String orausername;
	private String password;
	private String url;
	private String driverClassName;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getOrausername() {
		return orausername;
	}

	public void setOrausername(String orausername) {
		this.orausername = orausername;
	}

}
