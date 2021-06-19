package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.proje.model.Address;
import com.proje.model.Customer;

public class TestPersist {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		Customer customer = new Customer("Mücahit", "Yusuf", new Date());
		Address address = new Address("Kanuni", "Yıldırım", 31900);
		customer.setAddress(address);

		entityManager.getTransaction().begin();

		entityManager.persist(address);

		entityManager.persist(customer);

		entityManager.getTransaction().commit();

	}

}
