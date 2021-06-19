package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Student;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		Student student1 = new Student("Mücahit", "Zirek", new Date());

		Student student2 = new Student("Yusuf", "Zirek", new Date());

		transaction.begin();

		entityManager.persist(student1);
		entityManager.persist(student2);

		transaction.commit();

	}

}
