package com.proje.test;

import java.util.Date;
import java.util.List;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.repository.ProductRepository;
import com.proje.repository.impl.ProductRepositoryImpl;

public class Test {

	private static ProductRepository productRepository = new ProductRepositoryImpl();

	public static void main(String[] args) {

		/*--Butun hersey
		 * List<Product> products = productRepository.findProducts(); for (Product
		 * product : products) { System.out.println(product); }
		 * 
		 * products.forEach(System.out::println);
		 */

		/*
		 * --Id ye gore arama
		 * 
		 * Product product = productRepository.findProductById(1);
		 * System.out.println(product);
		 * 
		 */

		/*
		 * --Farkli Entitylerden ortak bir class olsuturup veriler elde edildi
		 * 
		 * List<ProductDetails> productDetails = productRepository.findProductDetails();
		 * productDetails.forEach(System.out::println);
		 */

		/*
		 * id ye gore arama ProductDetails productDetails =
		 * productRepository.findProductDetailsById(3);
		 * System.out.println(productDetails);
		 * 
		 */

		/*
		 * List<String> productnames = productRepository.findProductNames();
		 * System.out.println(productnames);
		 * 
		 */

		/*
		 * Liste içinde kaçtane satır varsa okadar dizi oluşturuluyor Kaç column
		 * çekilecekse her bir dizinin length o kadardır.
		 * 
		 * 2 column istenmektedir. Her bir dizinin boyutu 2 dir o zaman 9 Satır
		 * istenmektedir. Listin içinde ayrı ayrı 9 tane dizi mevcuttur.
		 * 
		 * List<Object[]> list = productRepository.findProductnameAndPrice();
		 * 
		 * for (Object[] objects : list) { System.out.println(objects[0] + " - " +
		 * objects[1]); }
		 * 
		 */

//		List<Product> products = productRepository.findGreatPrice(2700);
//		products.forEach(System.out::println);

//		List<Product> products = productRepository.findGreatAndLessPrice(2500, 3200);
//		products.forEach(System.out::println);

//		List<Product> products = pr//		List<Object[]> list = productRepository.findFunctionsPrice();
//		Object[] objects = list.get(0);
//		System.out.println("AVG : " + objects[0] + "\nSUM : " + objects[1] + "\nMAX : " + objects[2] + "\nMIN : "
//				+ objects[3] + "\nCOUNT : " + objects[4]);oductRepository.findBetweenPrice(2500, 3200);
//		products.forEach(System.out::println);

//		List<Product> products = productRepository.findLikeProductName("sus");
//		products.forEach(System.out::println);

//		List<Product> products = productRepository.findInCategoryname("Telefon", "Bilgisayar");
//		products.forEach(System.out::println);

//		Tabletlerin en yuksek fiyatlı urununden daha yuksek olan ürünleri getir (2600)

//		List<Product> products = productRepository.findAllProduct(2);
//		products.forEach(System.out::println);

//		List<Object[]> list = productRepository.findFunctionsPrice();
//		Object[] objects = list.get(0);
//		System.out.println("AVG : " + objects[0] + "\nSUM : " + objects[1] + "\nMAX : " + objects[2] + "\nMIN : "
//				+ objects[3] + "\nCOUNT : " + objects[4]);

//		List<Object[]> list = productRepository.findGroupByCategory();
//
//		for (Object[] objects : list) {
//			System.out.println("CategoryName : " + objects[0] + "  - AVG : " + objects[1]);
//		}

//		List<Object[]> list = productRepository.findGroupByHavingCategory(2600);
//
//		for (Object[] objects : list) {
//			System.out.println("CategoryName : " + objects[0] + "  - AVG : " + objects[1]);
//		}
//		
		List<Product> products = productRepository.findOrderByPrice();
		products.forEach(System.out::println);

	}

	public static void insertData() {

		Brand brand1 = new Brand("APPLE");
		Brand brand2 = new Brand("LG");
		Brand brand3 = new Brand("SONY");
		Brand brand4 = new Brand("SANSUNG");
		Brand brand5 = new Brand("ASUS");

		Category category1 = new Category("Bilgisayar");
		Category category2 = new Category("Tablet");
		Category category3 = new Category("Telefon");

		Product product1 = new Product("İphone 7", 3500, 2, brand1, category1, new Date());
		Product product2 = new Product("LG G3", 2500, 1, brand2, category3, new Date());
		Product product3 = new Product("Sony Experia", 2700, 1, brand3, category3, new Date());

		Product product4 = new Product("Samsung Z500", 1700, 1, brand4, category1, new Date());
		Product product5 = new Product("Mac i5", 4100, 1, brand1, category1, new Date());
		Product product6 = new Product("ASUS İ7", 3100, 2, brand5, category1, new Date());

		Product product7 = new Product("Galaxy Tablet", 2300, 1, brand4, category2, new Date());
		Product product8 = new Product("iPad", 2600, 3, brand2, category2, new Date());
		Product product9 = new Product("Sony Tablet", 2400, 1, brand3, category2, new Date());

		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);

		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);

		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);

	}

}
