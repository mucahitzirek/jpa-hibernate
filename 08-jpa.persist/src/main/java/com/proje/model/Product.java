package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product {

	@Id
	private int productId;

	private String name;

	private double unitPrice;

	private int avaible;

	@Temporal(TemporalType.TIMESTAMP)
	private Date addDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Product() {

	}

	public Product(int productId, String name, double unitPrice, int avaible, Date addDate, Date updateDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.avaible = avaible;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

}
