package com.bn.microservices.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private Environment environment;
	
	@RequestMapping("/")
	public String index() {		
		return "Hello World! "+environment.getProperty("local.server.port");
	}
}
