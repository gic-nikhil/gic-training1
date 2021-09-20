package io.javabrains;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Professor {
	
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + "]";
	}

}
