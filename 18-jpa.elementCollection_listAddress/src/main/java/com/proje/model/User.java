package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column
	private String username;

	private String firstName;

	@Temporal(TemporalType.DATE)
	private Date birthOfDate;

	@ElementCollection
	@CollectionTable(name = "user_adress", joinColumns = @JoinColumn(name = "userId"))
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "sokak", length = 50)),
			@AttributeOverride(name = "district", column = @Column(name = "ilce")) })
	private List<Address> addresses = new ArrayList<Address>();

	public User() {

	}

	public User(String username, String firstName, Date birthOfDate) {
		this.username = username;
		this.firstName = firstName;
		this.birthOfDate = birthOfDate;
	}

	public void addAddres(Address adress) {

		this.addresses.add(adress);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
