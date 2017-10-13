package tech.hobbs.hlfdocmgmntsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(){
		System.out.println(" This the welcome page showing");
		return "welcome";
	}

}
