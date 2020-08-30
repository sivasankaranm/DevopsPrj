package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class HelloController {

	@GetMapping(path="/hello",produces = "application/json")
	public String getHello(){
		return "Hello World! Test Docker";
	}
	
}
