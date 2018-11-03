package com.st.web.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="profile")
@PropertySource(value = "file:G:\\ApplicationWorkbook\\spring-boot-workspace\\profiletest_uat.properties")
@Profile(value = "uat")
public class UATConfig extends AppConfiguration {

}
