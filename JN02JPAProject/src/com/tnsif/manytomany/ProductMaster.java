package com.tnsif.manytomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProductMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String name;
	private float price;

	@ManyToMany(mappedBy = "products")
	private Set<OrderMaster> orders;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Set<OrderMaster> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderMaster> orders) {
		this.orders = orders;
	}

	public int getProductId() {
		return productId;
	}

	@Override
	public String toString() {
		return "ProductMaster [productId=" + productId + ", name=" + name + ", price=" + price + ", orders=" + orders
				+ "]";
	}

}
