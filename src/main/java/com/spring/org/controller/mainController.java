package com.spring.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class mainController {
	
	@RequestMapping("/")
	public String firstHandller(){
		System.out.println("this is my home page");
		return "Home";
		
	}
	
	@RequestMapping("/contect")
	public String contect(){
		System.out.println("this is my contect page");
		return "contect";
		
	}

}
