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

		Personel personel1 = new Personel("Mücahit Yusuf", "Zirek", new Date());

		personel1.getPhoneNumbers().add("123");
		personel1.getPhoneNumbers().add("432");

		Personel personel2 = new Personel("Mustafa", "Zirek", new Date());

		personel2.addPhoneNumber("011111");
		personel2.addPhoneNumber("02222");

		entityManager.getTransaction().begin();

		entityManager.persist(personel1);
		entityManager.persist(personel2);

		entityManager.getTransaction().commit();

	}

}
