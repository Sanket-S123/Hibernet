package com.tnsif.manytomany;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class OrderMaster {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int orderId;
	
	private Date purchaseDate;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_orders",
	joinColumns = { @JoinColumn(name = "order_id") },
	inverseJoinColumns = { @JoinColumn(name =
	"product_id") } )
	private Set<ProductMaster> products;

	public int getOrderId() {
		return orderId;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<ProductMaster> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductMaster> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "OrderMaster [orderId=" + orderId + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
	}

}
