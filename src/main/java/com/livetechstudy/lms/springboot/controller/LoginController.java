package com.livetechstudy.lms.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String welcome() {
		return "login";
	}
		
	@GetMapping("/login")
	public String login1() {
		return "login";
	}
}
