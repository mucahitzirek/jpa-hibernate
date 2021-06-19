package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birhtOfDate;

	@OneToMany(mappedBy = "user")
	private List<Product> products = new ArrayList<Product>();

	public User() {

	}

	public User(String firstName, String lastName, Date birhtOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birhtOfDate = birhtOfDate;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirhtOfDate() {
		return birhtOfDate;
	}

	public void setBirhtOfDate(Date birhtOfDate) {
		this.birhtOfDate = birhtOfDate;
	}

	public List<Product> getProducts() {
		return products;
	}

}
