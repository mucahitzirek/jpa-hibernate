package com.proje.repository.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import com.proge.jpaFactory.JPAFactory;
import com.proje.jpaFactoryImpl.JPAFactoryImpl;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {

	private JPAFactory jpaFactory = new JPAFactoryImpl();

	private EntityManager entityManager = jpaFactory.getEntityManager();

	@Override
	public List<Product> findProducts() {

		TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findProducts", Product.class);

		List<Product> products = typedQuery.getResultList();

		return products;

	}

	@Override
	public List<Product> findProductEntities(int firstResult, int maxResult) {

		TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findProducts", Product.class);

		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);

		List<Product> products = typedQuery.getResultList();

		return products;
	}

	@Override
	public Product findProductById(int productId) {
		TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findById", Product.class);

		typedQuery.setParameter("productId", productId);

		Product product = typedQuery.getSingleResult();

		return product;
	}

	@Override
	public List<ProductDetails> findProductDetails() {

		TypedQuery<ProductDetails> typedQuery = this.entityManager.createNamedQuery("Product.findProductDetails",
				ProductDetails.class);
		List<ProductDetails> productDetails = typedQuery.getResultList();

		return productDetails;
	}

	@Override
	public List<Product> findByCategoryName(String categoryName) {
		TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findByCategoryName",
				Product.class);

		typedQuery.setParameter("name", categoryName);

		List<Product> products = typedQuery.getResultList();

		return products;
	}

	@Override
	public int findProductCount() {

		TypedQuery<Long> typedQuery = this.entityManager.createNamedQuery("Product.findCount", Long.class);

		Long count = typedQuery.getSingleResult();

		return count.intValue();
	}

	@Override
	public List<Product> findAddDateLater(Date addDate) {
		TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findAddDateLater", Product.class);
		typedQuery.setParameter("addDate", addDate, TemporalType.TIMESTAMP);

		return typedQuery.getResultList();
	}

}
