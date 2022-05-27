package org.spring.controllers;

import javax.validation.Valid;

import org.spring.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	 @RequestMapping(value = "/loginForm", method = RequestMethod.GET)
    public String viewLoginPage(Model model) {
      Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "loginForm";
    }
	
	
	
	
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
     public String doLogin(@Valid Admin admin, BindingResult result,Model model) {
      model.addAttribute("admin",admin);
       if(result.hasErrors()){
           return "loginForm";
       }
      
       return "success2";
     }
}
