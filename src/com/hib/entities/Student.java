package com.hib.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue
	private Integer id;

	private String firstName;

	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(String firstName, Integer age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}

	public String toString() {
		return "(Student)[id = " + id + ", firstname = " + firstName + "]";
	}

}
