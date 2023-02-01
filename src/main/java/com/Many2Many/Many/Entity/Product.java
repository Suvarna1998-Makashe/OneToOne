package com.Many2Many.Many.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product_TBL")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PCode;
	@Column(name = "Product_Name")
	private String PName;
	@Column(name = "P_Quntity")
	private int Pquentity;
	@Column(name = "Price")
	private int Price;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product() {

	}

	public Product(int pCode, String pName, int pquentity, int price, Customer customer) {
		super();
		this.PCode = pCode;
		this.PName = pName;
		this.Pquentity = pquentity;
		this.Price = price;
		this.customer = customer;
	}

	public int getPCode() {
		return PCode;
	}

	public void setPCode(int pCode) {
		PCode = pCode;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public int getPquentity() {
		return Pquentity;
	}

	public void setPquentity(int pquentity) {
		Pquentity = pquentity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
