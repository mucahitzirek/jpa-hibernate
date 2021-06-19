package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;

	@Column
	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birthOfDate;

	// personel_personeId
	// phoneNumbers
	@ElementCollection
	@CollectionTable(name = "personel_phoneNumber", joinColumns = @JoinColumn(name = "personelId"))
	@Column(name = "phoneNumber", length = 11)
	private List<String> phoneNumbers = new ArrayList<String>();

	public Personel() {

	}

	public Personel(String firstName, String lastName, Date birthOfDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public void addPhoneNumber(String phoneNumber) {

		this.phoneNumbers.add(phoneNumber);

	}

	public void removePhoneNumbers(String phoneNumber) {

		this.phoneNumbers.remove(phoneNumber);
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

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
