package com.softtron.pinmaodd.demos;

public class TProduct {

	
	private String productName;
	private int productId;
	private String productPrice;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "TProduct [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ "]";
	}
	
}
