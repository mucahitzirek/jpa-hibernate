package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Department;
import com.proje.model.Employee;

public class TestFind {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		Employee employee = new Employee("Mücahity", "Zirek", new Date(), 3900);
		Department department = entityManager.find(Department.class, 1);

		employee.setDepartment(department);
		
		transaction.begin();

		entityManager.persist(employee);

		transaction.commit();
	}
}
