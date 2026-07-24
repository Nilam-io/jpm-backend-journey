package com.nilam.SpringBootApp.webApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nilam.SpringBootApp.service.IGreetingService;

@Controller
public class SpringBootController {

	@Autowired
	private IGreetingService service;

	@GetMapping("/greeting")
	public String generateWish(Model model) {

		String res = service.generateGreeting();
		model.addAttribute("wish", res);

		return "greet";
	}
}
