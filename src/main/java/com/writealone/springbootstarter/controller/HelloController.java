package com.writealone.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author  Jang Sept 13, 2017
 *
 */

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot!";
	}
}
