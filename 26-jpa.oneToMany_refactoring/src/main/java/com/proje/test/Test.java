package com.proje.test;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.proje.model.Product;
import com.proje.model.User;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		User user = new User("Mücahit", "Zirek", new Date());

		Product product1 = new Product("İphone", 3500, 1, new Date());
		product1.setUser(user);
		Product product2 = new Product("Samsung", 2500, 3, new Date());
		product2.setUser(user);

		/*
		 * 3 tane sql calisti ve 2 tablo olusturuldu
		 * 
		 */
		
		entityManager.getTransaction().begin();

		entityManager.persist(user);
		entityManager.persist(product1);
		entityManager.persist(product2);

		entityManager.getTransaction().commit();

	}

}
