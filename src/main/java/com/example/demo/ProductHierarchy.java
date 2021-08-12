package com.example.demo;

public class ProductHierarchy {

	private String productId;
	private String ProductName;
	private String ParentProduct;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getParentProduct() {
		return ParentProduct;
	}
	public void setParentProduct(String parentProduct) {
		ParentProduct = parentProduct;
	}
	@Override
	public String toString() {
		return "ProductHierarchy [productId=" + productId + ", ProductName=" + ProductName + ", ParentProduct="
				+ ParentProduct + "]";
	}
	public ProductHierarchy(String productId, String productName, String parentProduct) {
		super();
		this.productId = productId;
		ProductName = productName;
		ParentProduct = parentProduct;
	}
	public ProductHierarchy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
