package com.proje.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.proje.model.Product;
import com.proje.model.User;

public class TestPersist {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager entityManager = factory.createEntityManager();

		User user = new User("Mücahit", "Zirek", new Date());

		Product product1 = new Product("İphone", 3500, 1, new Date());
		Product product2 = new Product("Samsung", 2500, 3, new Date());
		List<Product> products = Arrays.asList(product1, product2);

		/*
		 * 5 SQL sorgusu calıstırıyor uc tablo olustu (sıkıntı)
		 * 
		 */

		user.setProducts(products);

		entityManager.getTransaction().begin();

		entityManager.persist(user);

		entityManager.getTransaction().commit();

	}

}
