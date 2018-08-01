package mum.swe.democrud.service.impl;

import mum.swe.democrud.model.Category;
import mum.swe.democrud.model.Person;
import mum.swe.democrud.repository.Categoryrepository;
import mum.swe.democrud.repository.Personrepository;
import mum.swe.democrud.service.CategoryService;
import mum.swe.democrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	Categoryrepository categoryrepository;
	
	@Override
	public List<Category> findAll() {		return categoryrepository.findAll()   ;
	}

	@Override
	public Category save(Category category) {
		return categoryrepository.save(category);
	}

	@Override
	public Category findOne(Long id) {
		return categoryrepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		categoryrepository.delete(id);
	}

}
