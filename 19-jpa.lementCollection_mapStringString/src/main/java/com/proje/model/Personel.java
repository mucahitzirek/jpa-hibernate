package com.proje.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personelId;

	private String firstName;

	private String lastName;

	private Date birthOfDate;

	@ElementCollection
	@CollectionTable(name = "personel_phoneNumber", joinColumns = @JoinColumn(name = "userId"))
	@MapKeyColumn(name = "phoneType")
	@Column(name = "phoneNumber")
	private Map<String, String> phoneNumbers = new HashMap<String, String>();

	public Personel() {

	}

	public Personel(String firstName, String lastName, Date birthOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public void addPhoneNumber(String key, String value) {
		this.phoneNumbers.put(key, value);
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
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

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}

}
