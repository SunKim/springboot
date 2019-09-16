package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	//main home
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() throws Exception{
		return "main/home";
	}

}
