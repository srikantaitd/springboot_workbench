package com.st.web.resource;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "mail")
@PropertySource(value = "file:G:\\ApplicationWorkbook\\spring-boot-workspace\\email.properties")
@Validated
public class EmailConfig {
	public static class Credentials {
		
		@NotBlank
		@Length(max = 4, min = 1)
		private String authMethod;
		
		private String username;
		private String password;

		public String getAuthMethod() {
			return authMethod;
		}

		public void setAuthMethod(String authMethod) {
			this.authMethod = authMethod;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Credentials [authMethod=" + authMethod + ", username=" + username + ", password=" + password + "]";
		}

		// standard getters and setters
	}

	private String host;
	private int port;
	private String from;
	private Credentials credentials;
	private List<String> defaultRecipients;
	private Map<String, String> additionalHeaders;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public List<String> getDefaultRecipients() {
		return defaultRecipients;
	}

	public void setDefaultRecipients(List<String> defaultRecipients) {
		this.defaultRecipients = defaultRecipients;
	}

	public Map<String, String> getAdditionalHeaders() {
		return additionalHeaders;
	}

	public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
		this.additionalHeaders = additionalHeaders;
	}

	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + ", from=" + from + ", credentials=" + credentials
				+ ", defaultRecipients=" + defaultRecipients + ", additionalHeaders=" + additionalHeaders + "]";
	}

}
