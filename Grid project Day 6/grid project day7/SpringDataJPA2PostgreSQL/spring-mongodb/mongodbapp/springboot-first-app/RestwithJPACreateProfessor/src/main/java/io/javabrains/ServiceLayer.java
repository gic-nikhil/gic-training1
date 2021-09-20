package io.javabrains;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceLayer {
	
@Autowired
private ProfessorInt pi;

public Optional<Professor> getProfessor(Integer id) {
	return pi.findOne(id);
}
}

