package com.kindsonthegenius.mongodbapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.tools.javac.util.List;

@SpringBootApplication
public class MongodbappApplication implements CommandLineRunner {
	
	@AutoWired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer("1", "Kindson", "Munonye");
		Customer c2 = new Customer("2", "Saffron", "Lawrence");
		Customer c3 = new Customer("3", "Liumdyla", "Narendra");
		Customer c4 = new Customer("4", "Oleand", "Yuba");
		
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		customerRepository.save(c4);
		
		System.out.println("***************");
		
		List customers = (List) customerRepository.findAll();
		
		Customer[] customer = null;
		for (Customer c : customer) {
			System.out.println(c.toString());
		}
	}

}
