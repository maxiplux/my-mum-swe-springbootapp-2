package mum.swe.democrud.service.impl;

import mum.swe.democrud.model.Person;
import mum.swe.democrud.model.Student;
import mum.swe.democrud.repository.Personrepository;
import mum.swe.democrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	Personrepository personRepository;
	
	@Override
	public List<Person> findAll() {		return personRepository.findAll()   ;
	}

	@Override
	public Person save(Person student) {
		return personRepository.save(student);
	}

	@Override
	public Person findOne(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		personRepository.delete(id);
	}

}
