package io.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestJpaServiceOfProfessor {
	
	@Autowired
	private ServiceLayer sl;
	
	@RequestMapping(value="/getdataobjectofprofessor/{id}",method=RequestMethod.GET)
	public Professor getProf(@PathVariable("id") Integer id) {
		sl.getProfessor(id);
		return null;
		
	}

}
