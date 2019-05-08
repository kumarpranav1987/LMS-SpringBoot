package com.livetechstudy.lms.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
	
	@GetMapping("/secure/logout")
	public String logout() {
		return "redirect:/logout";
	}
}
