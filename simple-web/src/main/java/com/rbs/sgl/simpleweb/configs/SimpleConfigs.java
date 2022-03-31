package com.rbs.sgl.simpleweb.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "simple")
public class SimpleConfigs {

	private String data;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String fourthName;
	
}
