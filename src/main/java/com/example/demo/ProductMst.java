package com.example.demo;

public class ProductMst {
	
	private String catDescr;
	private String catCode;
	private String itemCode;
	private String itemId;
	private String itemDescr;
	private String status;
	private String parentItemId;
	
	public String getCatDescr() {
		return catDescr;
	}
	public void setCatDescr(String catDescr) {
		this.catDescr = catDescr;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemDescr() {
		return itemDescr;
	}
	public void setItemDescr(String itemDescr) {
		this.itemDescr = itemDescr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getParentItemId() {
		return parentItemId;
	}
	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}
	@Override
	public String toString() {
		return "ProductMst [catDescr=" + catDescr + ", catCode=" + catCode + ", itemCode=" + itemCode + ", itemId="
				+ itemId + ", itemDescr=" + itemDescr + ", status=" + status + ", parentItemId=" + parentItemId + "]";
	}
	public ProductMst(String catDescr, String catCode, String itemCode, String itemId, String itemDescr, String status,
			String parentItemId) {
		super();
		this.catDescr = catDescr;
		this.catCode = catCode;
		this.itemCode = itemCode;
		this.itemId = itemId;
		this.itemDescr = itemDescr;
		this.status = status;
		this.parentItemId = parentItemId;
	}
	public ProductMst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
