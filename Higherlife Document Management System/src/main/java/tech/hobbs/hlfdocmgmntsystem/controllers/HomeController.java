package tech.hobbs.hlfdocmgmntsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage(){
		System.out.println("Getting there now");
		return "home";
	}

}
