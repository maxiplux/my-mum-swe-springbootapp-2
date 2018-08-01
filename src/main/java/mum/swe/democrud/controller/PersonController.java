package mum.swe.democrud.controller;

import mum.swe.democrud.model.Person;
import mum.swe.democrud.model.Student;
import mum.swe.democrud.repository.Categoryrepository;
import mum.swe.democrud.service.CategoryService;
import mum.swe.democrud.service.PersonService;
import mum.swe.democrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;

    @Autowired
    private CategoryService categoryService;




	@RequestMapping(value="/persons", method = RequestMethod.GET)
	public ModelAndView students(){		
		List<Person> persons = personService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("persons", persons);
		modelAndView.setViewName("persons/list");
		return modelAndView;
	}
	
	@RequestMapping(value="/persons/new", method = RequestMethod.GET)
	public String create(Model model){

        model.addAttribute("category", categoryService.findAll());
		model.addAttribute("person", new Person());


		return "persons/edit";
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("person") Person person,
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "student/edit";
		}
		person = personService.save(person);
		return "redirect:/persons";
	}	
	
	@RequestMapping(value="/person/{id}", method = RequestMethod.GET)
	public String view(@PathVariable Long id, Model model){
		model.addAttribute("category", categoryService.findAll());
		model.addAttribute("person", personService.findOne(id));
		return "persons/edit";
	}
	
	@RequestMapping(value="/person/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model)
	{
		personService.delete(id);
		return "redirect:/persons";
	}	
}
