package com.rbs.sgl.simpleweb.configs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.rbs.sgl.simpleweb.services.PropertyServiceForJasyptStarter;


public class EncryptionTesting {
	
	@Autowired
	private PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;
	
	@Autowired
	private Environment environment;
	
	@Test
	public void whenDecryptedPasswordNeeded_GetFromService() {
	    System.setProperty("jasypt.encryptor.password", "password");
	 
	    assertEquals("Password@1", propertyServiceForJasyptStarter.getProperty());
	 	 
	    assertEquals(
	      "Password@1", 
	      propertyServiceForJasyptStarter.getPasswordUsingEnvironment(environment));
	}
	
}
