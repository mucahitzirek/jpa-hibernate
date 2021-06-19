package com.proje.repository;

import com.proje.model.Book;

public interface BookRepository {


	void save(Book book);

	void delete(Book book);

	Book find(int id);

	Book update(Book book);

}
