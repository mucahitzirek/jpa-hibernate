package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;

	@Column
	private String street;

	private String city;

	private int postaCode;

	public Address() {

	}

	public Address(String street, String city, int postaCode) {
		this.street = street;
		this.city = city;
		this.postaCode = postaCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(int postaCode) {
		this.postaCode = postaCode;
	}

}
