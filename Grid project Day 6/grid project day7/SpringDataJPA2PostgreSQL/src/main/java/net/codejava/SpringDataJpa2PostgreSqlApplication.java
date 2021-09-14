package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import antlr.collections.List;

@SpringBootApplication
public class SpringDataJpa2PostgreSqlApplication implements CommandLineRunner {
	
	@Autowired
	private CompanyRepository companyRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2PostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		java.util.List<Company> COMPANY = companyRepo.findAll();
		
		COMPANY.forEach(System.out :: println);
		
		System.exit(0);
	}

}
