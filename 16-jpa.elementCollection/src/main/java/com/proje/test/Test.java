package com.proje.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Personel;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		Personel personel1 = new Personel("Mücahit Yusuf", "Zirek", new Date(), null);
		Personel personel2 = new Personel("Mustafa", "Zirek", new Date(), Arrays.asList("01111", "022222"));

//		List<String> phoneNumbers = new ArrayList<>();
//		phoneNumbers.add("05555555");
//		phoneNumbers.add("0666666");
		// Ayni islevi görürler
		List<String> phoneNumbers2 = Arrays.asList("055555", "066666");

		personel1.setPhoneNumbers(phoneNumbers2);

		entityManager.getTransaction().begin();

		entityManager.persist(personel1);
		entityManager.persist(personel2);
		entityManager.getTransaction().commit();

	}

}
