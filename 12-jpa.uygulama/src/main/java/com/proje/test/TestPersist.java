package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositoryImpl;

public class TestPersist {

	public static void main(String[] args) {

		BookRepository bookRepository = new BookRepositoryImpl();

		Book book1 = new Book(100, "Harry Pother", 350, "Aksiyon", "Mücahit", createCustomDate(26, 04, 1997));
		Book book2 = new Book(101, "Yüzüklerin Efendisi", 490, "Bilim-Kurgu", "Yusuf", createCustomDate(16, 05, 1991));

		bookRepository.save(book1);
		bookRepository.save(book2);
	}

	public static Date createCustomDate(int day, int month, int year) {

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);

		return calendar.getTime();

	}

}
