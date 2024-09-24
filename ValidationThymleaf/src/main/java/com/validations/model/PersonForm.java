package com.validations.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {
	
	@NotNull
	@Size(max = 10, min = 2)
	private String name;
	
	@NotNull
	@Min(value = 14)
	private Integer age;
	
	
	

	public PersonForm(String name,Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public PersonForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	
	

}
