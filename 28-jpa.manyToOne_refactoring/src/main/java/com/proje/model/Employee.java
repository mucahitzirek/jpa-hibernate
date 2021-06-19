package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	private String firstname;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date hireDate;

	private double salary;

	// Bir departmanede birden fazla isci calısabilir
	// bir isci sadece bir departmende calısabilir
	@ManyToOne
	@JoinColumn(name = "departmentId")
	private Department department;

	public Employee() {

	}

	public Employee(String firstname, String lastName, Date hireDate, double salary) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastName=" + lastName
				+ ", hireDate=" + hireDate + ", salary=" + salary + "]";
	}

}
