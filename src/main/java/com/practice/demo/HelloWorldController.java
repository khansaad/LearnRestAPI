package com.practice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/helloWorld")
	public String hello() {
		
		return "Testing Restful service";
		
	}
	
	//Hello-world-bean
	@GetMapping(path = "/hello-World-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Testing Restful service");
		
	}
	//Hello-world-bean with path variable
	@GetMapping(path = "/hello-World-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello, %s",name));
		
	}

	
}
