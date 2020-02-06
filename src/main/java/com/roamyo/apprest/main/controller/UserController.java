package com.roamyo.apprest.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roamyo.apprest.test.TestModel;

@RestController
public class UserController {
	
	@GetMapping("/getUser")
	public TestModel getUserDetails() {
		TestModel ts= new TestModel();
		ts.setEmail("arshsharma85@gmail.com");
		ts.setFirstName("Arsh");
		ts.setLastName("Sharma");
		ts.setPassword("Password");
		return ts;
	}

}
