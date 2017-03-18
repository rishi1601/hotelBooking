package com.hotelbooking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	private final static String controllerName = "index/";

	
	
	@RequestMapping("/")
	public String indexPage(HttpServletRequest request , HttpServletResponse response , Model model)
	{
		
		System.out.println("This is index controller");
		return controllerName+"index";
		
	}
	
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request , HttpServletResponse response , Model model)
	{
		
		System.out.println("This is index controller");
		return controllerName+"index";
		
	}
	
	
	

}
