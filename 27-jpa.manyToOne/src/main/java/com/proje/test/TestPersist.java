package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Department;

public class TestPersist {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		Department department = new Department("Yazili", 3500, 5600);

		Department department2 = new Department("Tester", 2500, 3700);

		transaction.begin();

		entityManager.persist(department);
		entityManager.persist(department2);
		

		transaction.commit();

	}

}
