package mum.swe.democrud.service;

import mum.swe.democrud.model.Person;
import mum.swe.democrud.model.Student;

import java.util.List;

public interface PersonService {
	 List<Person> findAll();
	 Person save(Person person);
	 Person findOne(Long id);
	 void delete(Long id);
}
