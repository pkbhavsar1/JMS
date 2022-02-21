package com.JMSReciver.JMSReciver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int productId;
    private String name;
    private int quantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Product(int productId, String name, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
    
    
}
