package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.Person;

/**
 * Работает с базой данных
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
