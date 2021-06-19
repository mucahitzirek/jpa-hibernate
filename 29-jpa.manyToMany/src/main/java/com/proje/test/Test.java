package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Student;
import com.proje.model.University;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		University university = new University("İSTE");
		University university2 = new University("KTÜ");
		University university3 = new University("İtu");

		Student student = new Student("Mücahit", "Zirek", new Date());

		student.addUniversity(university);
		student.addUniversity(university2);
		
		Student student2 = new Student("Yusuf", "Soyadi", new Date());

		student2.addUniversity(university2);
		student2.addUniversity(university3);

		transaction.begin();

		entityManager.persist(university);
		entityManager.persist(university2);
		entityManager.persist(university3);
		entityManager.persist(student);
		entityManager.persist(student2);

		transaction.commit();

	}

}
