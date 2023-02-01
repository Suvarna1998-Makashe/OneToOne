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
@Table(name = "Coutomer_TBL")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Coustomer_Name")
	private String Cname;
	@Column(name = "Coustomer_Add")
	private String Add;
	@Column(name = "Phone_No")
	private String No;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer() {

	}

	public Customer(int id, String cname, String add, String no, Product product) {
		super();
		this.id = id;
		this.Cname = cname;
		this.Add = add;
		this.No = no;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

}
