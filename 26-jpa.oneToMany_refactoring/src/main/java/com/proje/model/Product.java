package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	private String name;

	private double unitPrice;

	private int avaible;

	private Date addDate;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Product() {

	}

	public Product(String name, double unitPrice, int avaible, Date addDate) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.avaible = avaible;
		this.addDate = addDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
