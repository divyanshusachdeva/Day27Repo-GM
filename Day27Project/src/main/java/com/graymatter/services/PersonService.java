package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Person;
import com.graymatter.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repository;
	
	public List<Person> getAllPersons() {
		return repository.findAll();
	}

	public List<Person> getAllPersonsByName(String name) {
		return repository.findByName(name);
	}

	public Person addPerson(Person person) {
		return repository.save(person);
	}
	
	public List<Person> getAllPersonsByNameAndAge(String name, int age) {
		return repository.nameAgeQuery(name, age);
	}
	
	
}
