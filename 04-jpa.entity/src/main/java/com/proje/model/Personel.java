package com.proje.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personel {

	@Id
	private int personelId;
	private String firstName;
	private String lastname;
	private String birthOfDate;
	private String personelNumber;

	public Personel() {

	}

	public Personel(int personelId, String firstName, String lastname, String birthOfDate, String personelNumber) {
		super();
		this.personelId = personelId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(String birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getPersonelNumber() {
		return personelNumber;
	}

	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}

}
