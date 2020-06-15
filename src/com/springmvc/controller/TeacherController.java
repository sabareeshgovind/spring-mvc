package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@RequestMapping("/newTeacher")
	public String newTeacher(Model model) {
		Teacher teacher = new Teacher();
		model.addAttribute("teacher",teacher);
		return "newTeacher";
	}
	

	@RequestMapping("/processTeacher")
	public String processTeacher(@Valid@ModelAttribute Teacher teacher, BindingResult bindingResult, Model model) {
		
		System.out.println("Binding result:"+ bindingResult);
		if (bindingResult.hasErrors()) {
			return "newTeacher";
		} else {
			model.addAttribute("teacher", teacher);
			return "confirmTeacher";
		}
		
		
		
		
	}
	
}
