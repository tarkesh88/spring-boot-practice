package com.example.firstaws.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController("/first")
public class DemoController {


	@GetMapping
	public boolean get() {
		return true;
	}

	@GetMapping("/check")
	public String getCheck() {
		return "success";
	}

}
