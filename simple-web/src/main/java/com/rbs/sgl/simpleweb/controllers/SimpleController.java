package com.rbs.sgl.simpleweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.sgl.simpleweb.configs.SimpleConfigs;

@RestController
public class SimpleController {
	
	@Autowired
	private SimpleConfigs configs;
	
	@GetMapping("/server/env")
	private String getStatus() {
		return configs.toString();
	}

}