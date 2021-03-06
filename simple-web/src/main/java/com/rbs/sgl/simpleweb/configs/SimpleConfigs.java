package com.rbs.sgl.simpleweb.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import lombok.Data;

//@Data
@Configuration
@EnableEncryptableProperties
@ConfigurationProperties(prefix = "simple")
public class SimpleConfigs {

	private String data;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String fourthName;
	private Object fifthName;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	public String getFourthName() {
		return fourthName;
	}
	public void setFourthName(String fourthName) {
		this.fourthName = fourthName;
	}
	public Object getFifthName() {
		return fifthName;
	}
	public void setFifthName(Object fifthName) {
		this.fifthName = fifthName;
	}
	
}
