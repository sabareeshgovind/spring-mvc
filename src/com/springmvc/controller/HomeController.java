package com.springmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}

	// Gather name form
	@RequestMapping("/name")
	public String getName() {
		return "name";
	}

	//Process Name from form
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		model.addAttribute("message",name);
		return "indexName";
		
	}

	//Process using @RequestParam
	@RequestMapping("/processForm2")
	public String processForm2(@RequestParam("studentName") String theName, Model model) {
		model.addAttribute("message",theName);
		return "indexName";
		
	}
	
	
}
