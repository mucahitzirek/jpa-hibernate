package com.proje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmenId;

	private String name;

	private double minSalary;

	private double maxSalary;

	public Department() {

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
