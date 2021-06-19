package com.proje.repository;

import java.util.List;
import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;

public interface ProductRepository {

	// Urunu kaydetmek icin
	Product saveProduct(Product product);

	// Marka kaydetmek icin
	Brand saveBrand(Brand brand);

	// Kategori kaydetmek icin
	Category saveCategory(Category category);

	// Butun urunleri cekmek
	List<Product> findProducts();

	// Belirli araliklardaki butun urunler cekilecek
	List<Product> findProductEntities(int firstResult, int maxResult);

	// ıd ile arama yapılacak
	Product findProductById(int productId);

	// On yuzde cıkacak bilgileri (diger tabloların birlesimi ile elde edilecek kimi
	// bilgiler)
	List<ProductDetails> findProductDetails();

	// ıd ile arama yapılacak
	ProductDetails findProductDetailsById(int productId);

	// urunlerin sadece isimleri
	List<String> findProductNames();

	// urunlerin isimleri ve fiyatlari
	List<Object[]> findProductnameAndPrice();

	// Verilen fiyattan buyuk fiyati olan urunlari getirilecek
	List<Product> findGreatPrice(double unitPrice);

	// min max fiyat araligi degerleri
	List<Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice);

	// min max fiyat araligi degerleri
	List<Product> findBetweenPrice(double minUnitPrice, double macUnitPrice);

	// Productlarin ismine gore arama yapilacak
	List<Product> findLikeProductName(String productName);

	// Verilen kategorideki urunler getirilecek
	List<Product> findInCategoryname(String categoryName1, String categoryName2);

	// Verilen kategorinin price degerinden yuksek olan getir
	List<Product> findAllProduct(int categoryId);

	List<Object[]> findFunctionsPrice();

	// Kategoriye gore gruplama yapilacak
	List<Object[]> findGroupByCategory();

	List<Object[]> findGroupByHavingCategory(double unitPrice);

	List<Product> findOrderByPrice();

}
