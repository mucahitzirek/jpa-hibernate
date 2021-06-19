package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.proje.model.Product;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = factory.createEntityManager();

		Product product = entityManager.find(Product.class, 101);

		if (product != null) {
			System.out.println("Ürün Bilgileri:...");
			System.out.println("Ürün id : " + product.getProductId());
			System.out.println("Adi : " + product.getName());
			System.out.println("Fiyati : " + product.getUnitPrice());
			System.out.println("Mevcut : " + product.getAvaible());
			System.out.println("Ürünün eklenme tarihi : " + product.getAddDate());
			System.out.println("Ürünün Güncellenme tarihi : " + product.getUpdateDate());
		} else {
			System.out.println("Ürün Bulunamadi...");
		}

	}

}
