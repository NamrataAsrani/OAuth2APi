package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor


public class DemoAppController {
	
	@GetMapping("/app/{value}")
	public String getValue(@PathVariable String value) {
		return "Authorized the API and the value is "+value;
	}

}
