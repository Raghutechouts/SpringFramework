package org.spring.controllers;

import javax.validation.Valid;

import org.spring.customvalidator.CustomValidator;
import org.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomValidationController {

	@Autowired
	private CustomValidator customValidator;

	@RequestMapping("/showRegister")
	public String showRegister(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "register";
	}
	@RequestMapping("/doRegister")
	public String doRegister(@Valid Student student,BindingResult result,Model model) {
		model.addAttribute("student", student);
		customValidator.validate(student, result);
		if(result.hasErrors()) {
			return "register";
		}
		return "success3";
		
	}

	public CustomValidator getCustomValidator() {
		return customValidator;
	}

	public void setCustomValidator(CustomValidator customValidator) {
		this.customValidator = customValidator;
	}
	
}
