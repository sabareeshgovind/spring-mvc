package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/newStudent")
	public String newStudent(Model model) {
		Student studentobj = new Student();
		model.addAttribute("student",studentobj);
		return "newStudent";
	}

	@RequestMapping("/processStudent")
	public String processStudent(@ModelAttribute("student") Student student, Model model) {
		String first = student.getFirstName();
		String last = student.getLastName();
		
		model.addAttribute("first", first);
		model.addAttribute("last", last);
		model.addAttribute("student", student); // You can pass it this way also
		
		/*
		System.out.println("First Name: "+first);
		System.out.println("Last Name: "+last);
		*/
		
		return "confirmStudent";
	}
	
}
