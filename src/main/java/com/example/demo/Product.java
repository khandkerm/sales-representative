package com.example.demo;

public class Product {

	private String productId;
	private String productDecs;
	
	public Product(String productId, String productDecs) {
		super();
		this.productId = productId;
		this.productDecs = productDecs;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDecs=" + productDecs + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductDecs() {
		return productDecs;
	}
	public void setProductDecs(String productDecs) {
		this.productDecs = productDecs;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
