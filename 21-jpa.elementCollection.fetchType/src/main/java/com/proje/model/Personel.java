package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;

import com.proje.model.util.PhoneType;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personelId;

	private String firstName;

	private String lastName;

	private Date birthOfDate;

	@ElementCollection(fetch = FetchType.LAZY) // İlişkili tablodaki verileri getirmesini istemiyorsan LAZY kullanılır
	@CollectionTable(name = "personel_email", joinColumns = @JoinColumn(name = "personelId"))
	@Column(name = "email")
	private List<String> emails = new ArrayList<String>();

	@ElementCollection
	@CollectionTable(name = "personel_phoneNumber", joinColumns = @JoinColumn(name = "userId"))
	@MapKeyColumn(name = "phoneType")
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name = "phoneNumber")
	private Map<PhoneType, String> phoneNumbers = new HashMap<PhoneType, String>();

	public Personel() {

	}

	public Personel(String firstName, String lastName, Date birthOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public void addEmail(String email) {
		this.emails.add(email);
	}

	public void addPhoneNumber(PhoneType phoneType, String phoneNumber) {
		this.phoneNumbers.put(phoneType, phoneNumber);
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

	public Map<PhoneType, String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public List<String> getEmails() {
		return emails;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthOfDate=" + birthOfDate + "]";
	}

}
