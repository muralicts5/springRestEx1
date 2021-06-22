package com.example.springRestDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/hello")
	public String sayHelloWorld() {
		return "Hello";
	}
	
	@RequestMapping("/hi")
	public String sayHid() {
		return "Hi World";
	}
	
}
