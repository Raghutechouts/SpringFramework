package org.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MomsCafe {
	
	@RequestMapping("/itemPage")
	public String selectItem() {
		return "selectItem";
	}
	
	@RequestMapping("/orderNow")
	//public String  orderNow(HttpServletRequest req,Model model) {
		
		public String  orderNow(@RequestParam("foodItem") String foodName , Model model) {

		//String foodName = req.getParameter("foodItem");
		model.addAttribute("foodName", foodName);
		
		return "orderPage";
	}
	
	@RequestMapping("/help")
	public ModelAndView help(ModelAndView modelAndView) {
		
		modelAndView.addObject("name", "Virat");
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(101);
		modelAndView.addObject("id", list);
		modelAndView.setViewName("help");
		return modelAndView;
		
		
	}
	
}
