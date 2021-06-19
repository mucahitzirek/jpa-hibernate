package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Contact;
import com.proje.model.User;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		User user1 = new User("mucahit21", "123456", new Contact("0555555", "mucahit21@gmail.com", "mucahit.com"),
				new Date());
  
		transaction.begin();

		entityManager.persist(user1);

		transaction.commit();

	}

}
