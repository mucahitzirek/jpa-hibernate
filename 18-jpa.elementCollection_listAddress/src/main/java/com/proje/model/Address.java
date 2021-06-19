package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;

	private String district;

	private String city;

	private int postalCode;

	public Address() {

	}

	public Address(String street, String distring, String city, int postalCode) {
		super();
		this.street = street;
		this.district = distring;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistring() {
		return district;
	}

	public void setDistring(String distring) {
		this.district = distring;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}
