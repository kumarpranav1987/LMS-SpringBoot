package com.livetechstudy.lms.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String welcome() {
		return "login";
	}
	
	/*
	 * @GetMapping("/welcome") public String login() { return "welcome"; }
	 */
	
	@GetMapping("/login")
	public String login1() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
