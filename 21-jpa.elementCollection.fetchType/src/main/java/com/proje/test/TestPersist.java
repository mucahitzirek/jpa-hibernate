package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.proje.model.Personel;

public class TestPersist {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		Personel personel = entityManager.find(Personel.class, 1);

		System.out.println(personel);

		System.out.println("Emails : " + personel.getEmails());

		System.out.println("Phone : " + personel.getPhoneNumbers());
	}

}
