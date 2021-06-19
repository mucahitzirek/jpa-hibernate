package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.proje.model.Address;
import com.proje.model.Customer;

public class TestFind {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		Customer customer = entityManager.find(Customer.class, 1);

		entityManager.getTransaction().begin();

		entityManager.remove(customer);

		entityManager.getTransaction().commit();

	}

}
