package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/app1")
	public String m1() {
		return "Hello All Good Mrng....";
	}
	
	@GetMapping("/add")
	public int add() {
		int a=10,b=20;
		return a+b;
	}

	
}
