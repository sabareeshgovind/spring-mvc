package com.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.springmvc.validation.CourseCode;



public class Teacher{

	private String firstName;
	
	@NotNull(message= "is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@Min(value=0, message = "Must be more than 0 and less than 8")
	@Max(value=8, message= "Must be less than 8 and more than 0")
	private int classes;
	
	
	@NotNull(message="is required")
	@Min(value=0, message = "Must be more than 0 and less than 800s")
	@Max(value=800, message= "Must be less than 800 and more than 0")
	private Integer professorCode;
	
	@CourseCode
	private String professorLoginCode;
	

	public Integer getProfessorCode() {
		return professorCode;
	}

	public void setProfessorCode(Integer professorCode) {
		this.professorCode = professorCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public String getProfessorLoginCode() {
		return professorLoginCode;
	}

	public void setProfessorLoginCode(String professorLoginCode) {
		this.professorLoginCode = professorLoginCode;
	}
	
	
	
	
}
