package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE p.name=:name")
@NamedQuery(name = "Person.nameAgeData", query = "SELECT p FROM Person p WHERE p.name=:name AND p.age=:age")

public class Person {

	String name;
	@Id
	int id;
	int age;
	
}
