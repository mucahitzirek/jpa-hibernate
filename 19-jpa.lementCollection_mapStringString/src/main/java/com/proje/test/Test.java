package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.proje.model.Personel;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		Personel personel1 = new Personel("Mücahit", "Yusuf", new Date());

		personel1.getPhoneNumbers().put("Cep", "055555");
		personel1.addPhoneNumber("EV", "021111");

		entityManager.getTransaction().begin();

		entityManager.persist(personel1);

		entityManager.getTransaction().commit();

	}

}
