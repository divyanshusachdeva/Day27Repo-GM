package com.graymatter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Person;
import com.graymatter.services.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;
	
	@GetMapping("/person")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}
	
	@GetMapping("/person/{name}")
	public List<Person> getAllPersonsByName(@PathVariable ("name") String name) {
		return service.getAllPersonsByName(name);
	}
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		return service.addPerson(person);
	}

	@GetMapping("/person/{name}/{age}")
	public List<Person> getAllPersonsByNameAndAge(@PathVariable ("name") String name, @PathVariable ("age") int age) {
		return service.getAllPersonsByNameAndAge(name, age);
	}
}

