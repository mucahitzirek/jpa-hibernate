package com.proje.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Book;
import com.proje.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();

	private EntityManager entityManager = jpaFactory.getentityManager();

	private EntityTransaction transaction = jpaFactory.getEntityTransaction();

	@Override
	public void save(Book book) {

		transaction.begin();

		this.entityManager.persist(book);

		transaction.commit();

	}

	@Override
	public void delete(Book book) {
		transaction.begin();

		this.entityManager.remove(book);

		transaction.commit();

	}

	@Override
	public Book find(int id) {
		Book book = this.entityManager.find(Book.class, id);

		if (book != null) {

			return book;
		}

		return null;
	}

	@Override
	public Book update(Book book) {
		
		transaction.begin();

		Book updateBook = this.entityManager.merge(book);

		transaction.commit();

		return updateBook;
	}

}
