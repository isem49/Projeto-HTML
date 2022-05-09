package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		
		
		return "index";
	}
	
	@GetMapping("/signin")
	public String signin() {
		
		
		return "signin";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		
		return "dashboard";
	}
	
	@GetMapping("/signup")
	public String signup() {
		
		return "signup";
		
	}
	
	
}
