package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birthOfDate;

	// bir ogrenci birden cok universite okuyabilir
	// bir universitede birden cok ogrenci okuyabilir

	@ManyToMany
	@JoinTable(name = "student_university", joinColumns = @JoinColumn(name = "studentId"), inverseJoinColumns = @JoinColumn(name = "universityId"))
	private List<University> universities = new ArrayList<University>();

	public Student() {

	}

	public Student(String firstName, String lastName, Date birthOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public void addUniversity(University university) {
		this.universities.add(university);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

}
