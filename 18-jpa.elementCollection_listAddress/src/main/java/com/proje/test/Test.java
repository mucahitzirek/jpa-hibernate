package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.proje.model.Address;
import com.proje.model.User;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		User user1 = new User("mücahityusufzirek", "Mücahit", new Date());

		Address adress1 = new Address("Kanuni Sokak", "Yıldırım Beyazıt", "Hatay", 01111);

		user1.getAddresses().add(adress1);
		user1.getAddresses().add(new Address("Sokak", "Mahalle", "Sehir", 02222));

		User user2 = new User("karizma01", "Baki", new Date());

		Address address2 = new Address("Meydan Mah", "Merkez", "Kütahya", 155555);

		user2.addAddres(address2);
		user2.addAddres(new Address("Deneme Sokak", "Deneme ilçe", "Deneme Sehir", 166666));

		entityManager.getTransaction().begin();

		entityManager.persist(user1);
		entityManager.persist(user2);

		entityManager.getTransaction().commit();

	}

}
