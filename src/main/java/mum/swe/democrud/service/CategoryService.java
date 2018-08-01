package mum.swe.democrud.service;

import mum.swe.democrud.model.Category;
import mum.swe.democrud.model.Person;

import java.util.List;

public interface CategoryService
{
	 List<Category> findAll();
	 Category save(Category category);
	Category findOne(Long id);
	 void delete(Long id);
}
