package org.spring.controller;

import java.util.List;

import org.spring.dao.UserDao;
import org.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("home")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping("register")
	public String  regForm(Model model) {
		model.addAttribute("user", new User());
		 return "register";
		
	}
	@RequestMapping("login")
	public String  loginForm(Model model) {
		model.addAttribute("user", new User());
		 return "login";  
	}

	@PostMapping("/doRegister")
	public String saveData(@ModelAttribute User user,Model model) {
		model.addAttribute("user", new User());
		List<User> list = userDao.getAllData();
		for (User u:list) {
			if(u.getEmail()==user.getEmail()) {
				return "account-exists";
			}
		}
		int i = this.userDao.saveData(user);
		if(i>0) {
			return "login";
		}
		return "error";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute User user,Model model) {
		model.addAttribute("user", user);
		List<User> list = userDao.getAllData();
		for (User u:list) {
			if(user.getPassword().equals(u.getPassword())&&user.getEmail().equals(u.getEmail())) {
				return "main";
			}
		}
		return "login-error";
	}
	
}
