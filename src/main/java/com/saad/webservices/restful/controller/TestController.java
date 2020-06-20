package com.saad.webservices.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saad.webservices.restful.TestBean;

@RestController
public class TestController {

	@GetMapping(path = "/test1")
	public String test1Get() {
		return "Test 1 successful";
	}
	
	@GetMapping(path = "/")
	public String landing() {
		return "Welcome to nothing";
	}
	
	//Test-bean
		@GetMapping(path = "/test-bean")
		public TestBean testBean() {
			
			return new TestBean("Testing Restful service");
			
		}
	//with path variable
	@GetMapping(path = "/test1/{name}")
	public String pathVariableTest(@PathVariable String name) {
		return String.format("Welcome, %s",name);
	}
	
	@PostMapping(path = "/test1")
	public void test1Post() {
		
	}
}
