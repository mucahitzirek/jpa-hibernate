package com.proje.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*
 * personel
 * 
 */

@Entity
@Table(name = "personel")
public class Personel {

	@Id
	@Column(name = "id", unique = true, length = 10, nullable = false)
	private int personelId;

	@Column(name = "isim", length = 20, updatable = false)
	private String firstName;

	private String lastname;
	/*
	 * Date : Sadece tarih tutar 01/01/2020
	 * 
	 * Time : Sadece saat tutar
	 * 
	 * TimeStamp : Hem tarih hem saat tutar
	 * 
	 */

	@Temporal(TemporalType.DATE)
	@Column(name = "dogumTarihi")
	private Date birthOfDate;

	@Column
	private String personelNumber;

	@Lob
	private String about;

	@Transient
	private double salary;

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Personel() {

	}

	public Personel(int personelId, String firstName, String lastname, Date birthOfDate, String personelNumber) {
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

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getPersonelNumber() {
		return personelNumber;
	}

	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}

}
