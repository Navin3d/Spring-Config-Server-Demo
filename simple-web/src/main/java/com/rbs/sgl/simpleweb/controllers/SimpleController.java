package com.rbs.sgl.simpleweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.sgl.simpleweb.configs.SimpleConfigs;
import com.rbs.sgl.simpleweb.services.PropertyServiceForJasyptStarter;

@RestController
public class SimpleController {
	
	@Autowired
	private SimpleConfigs configs;
	
//	@Autowired
//	private PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;
//	
//	@Autowired
//	private Environment environment;
	
	@GetMapping("/server/env")
	private String getStatus() {
		return configs.toString();
	}
	
//	@GetMapping("/server/env/enc")
//	private String getStatusEnc() {
//		
////		System.setProperty("jasypt.encryptor.password", "password");
//		 
//	    return  "Enc=" + propertyServiceForJasyptStarter.getProperty() + " Non= " + propertyServiceForJasyptStarter.getPasswordUsingEnvironment(environment);
//	}

}
