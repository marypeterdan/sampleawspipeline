package com.stackroute.samplepipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/home")
	public ResponseEntity<?> getHome()
	{
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}
	
	@GetMapping("/view")
	public ResponseEntity<?> getall()
	{
		return new ResponseEntity<String>("we learnt aws cicd",HttpStatus.OK);
	}
}
