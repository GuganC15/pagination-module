package com.springprog.pegination.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Userdatadetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String email;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

