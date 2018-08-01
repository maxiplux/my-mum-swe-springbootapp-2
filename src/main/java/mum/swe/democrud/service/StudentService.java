package mum.swe.democrud.service;

import mum.swe.democrud.model.Student;

import java.util.List;

public interface StudentService {
	 List<Student> findAll();
	 Student save(Student student);
	 Student findOne(Long id);
	 void delete(Long id);
}
