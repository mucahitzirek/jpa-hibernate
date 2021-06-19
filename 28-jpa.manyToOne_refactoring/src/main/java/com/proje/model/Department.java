package com.proje.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmenId;

	private String name;

	private double minSalary;

	private double maxSalary;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Department() {

	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(String name, double minSalary, double maxSalary) {
		this.name = name;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public int getDepartmenId() {
		return departmenId;
	}

	public void setDepartmenId(int departmenId) {
		this.departmenId = departmenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Department [departmenId=" + departmenId + ", name=" + name + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}

}
