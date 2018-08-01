package mum.swe.democrud.repository;


import mum.swe.democrud.model.Person;
import mum.swe.democrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("personRepository")
public interface Personrepository  extends JpaRepository<Person, Long> {
}
