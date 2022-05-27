package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerOne {

	@RequestMapping("home")
	public String goHome() {
		return "home";

	}

	@RequestMapping("final")
	public String goEnd() {
		return "final";

	}
}
