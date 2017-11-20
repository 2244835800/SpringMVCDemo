package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value="/home")
	public String index(){
		return "index";
		
	}
	
	@RequestMapping(value="/home2")
	public String index2(){
		return "index2";
		
	}
		
	@RequestMapping(value="/")
	public String defaultIndex(){
		return "index3";
	}
	
}
