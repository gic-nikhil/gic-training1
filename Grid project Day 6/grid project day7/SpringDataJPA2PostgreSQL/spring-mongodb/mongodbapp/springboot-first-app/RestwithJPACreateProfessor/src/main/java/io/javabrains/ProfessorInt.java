package io.javabrains;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorInt extends CrudRepository <Professor, Integer>{

	Optional<Professor> findOne(Integer id);

}
