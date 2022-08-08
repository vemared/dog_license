package com.doglicense.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * Dog License Model to hold the properties of Dog License Application.
 *
 */
@Entity
public class DogLicense {

	@Id
	private int id;

	private String name;

	private String color;

	private String breed;

	private String birthYear;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "DogModel [id=" + id + ", name=" + name + ", color=" + color + ", breed=" + breed + ", birthYear="
				+ birthYear + "]";
	}
}
