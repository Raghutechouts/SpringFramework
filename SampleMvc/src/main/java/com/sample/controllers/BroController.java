package com.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BroController {

	@ResponseBody
	@RequestMapping("/bat")
	public String  giveSugar() {
		return "Here your bat";
		
	}
}

