package com.proje.model;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column
	private String username;

	@Column
	private String password;

	@Embedded
	@AttributeOverrides({ 
		@AttributeOverride(name = "phoneNumber", column = @Column(name = "telefon", length = 11)),
		@AttributeOverride(name="email" , column=@Column(name="userEmail",length = 25,nullable = true,unique = true))

	})
	private Contact contact;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public User() {

	}

	public User(String username, String password, Contact contact, Date creationDate) {
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.creationDate = creationDate;
	}

}
