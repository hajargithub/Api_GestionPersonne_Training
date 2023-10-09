package com.codingTechV2.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Personne(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Personne() {
		super();
	}
	
	 
	

}
