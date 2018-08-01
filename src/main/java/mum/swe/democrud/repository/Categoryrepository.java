package mum.swe.democrud.repository;


import mum.swe.democrud.model.Category;
import mum.swe.democrud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryRepository")
public interface Categoryrepository extends JpaRepository<Category, Long> {
}
