package com.proje.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int universityId;

	private String name;

	@ManyToMany(mappedBy = "universities")
	private List<Student> students;

	/*
	 * 
	 * Many To Many problem oldugunda Ornegin veritabanından Student cekip icine
	 * University ekleme problem olabilir
	 * 
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "student_university", joinColumns = @JoinColumn(name =
	 * "studentId"), inverseJoinColumns = @JoinColumn(name = "universityId"))
	 * private List<Student> students;
	 */

	public University() {

	}

	public University(String name) {
		this.name = name;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
