package com.oak.users.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping
	public ResponseEntity<String> get() {
		return new ResponseEntity<>("Hello World",HttpStatus.OK);
	}
	
}
