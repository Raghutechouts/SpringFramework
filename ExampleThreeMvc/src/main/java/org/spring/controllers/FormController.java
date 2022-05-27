package org.spring.controllers;

import org.spring.model.User;
import org.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public String setRegister() {
		return "fillForm";
	}

	/*@PostMapping("/dataSaver")
	public String saveData(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password,Model model) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
	
		model.addAttribute("user", user);

		return "success";

	}*/
	
	
	@PostMapping("/dataSaver")
	public String saveData(@ModelAttribute User user,BindingResult result) {
		if(result.hasErrors()) {
			return "error";
		}
		this.userService.createUser(user);
		return "success";

	}
}
