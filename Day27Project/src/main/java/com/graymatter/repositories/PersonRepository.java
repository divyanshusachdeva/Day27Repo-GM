package com.graymatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Person;
import java.util.List;



@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	@Query(name = "Person.findByName")
	public List<Person> findByName(@Param("name") String name);

	@Query(name = "Person.nameAgeData")
	public List<Person> nameAgeQuery(@Param("age") String name, @Param("age") int age);

}
