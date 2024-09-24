package com.validations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.validations.model.PersonForm;

import jakarta.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {
   public void addview(ViewControllerRegistry controllerRegistry) {
		
		controllerRegistry.addViewController("/results").setViewName("results");
		
		
	}
	
	@GetMapping("/")
	public String showForm(PersonForm personForm) {
		return "form";
		
	}
	
	@PostMapping("/")
	public String checkpersoninfo(@Valid PersonForm personForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "form";
		}
		
		return "redirect:/results";
	}
	
	
	
	
	
	
}
