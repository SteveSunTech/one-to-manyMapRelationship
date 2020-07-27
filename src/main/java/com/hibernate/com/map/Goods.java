package com.hibernate.com.map;

public class Goods {
	private String pid;
	private String product;
	private String productID;
	public Goods() {
		System.out.println("Goods are created");
	}

	public String getPid() {
		return pid;
	}



	public void setPid(String pid) {
		this.pid = pid;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public String getProductID() {
		return productID;
	}



	public void setProductID(String productID) {
		this.productID = productID;
	}



	@Override
	public String toString() {
		return "Goods [pid=" + pid + ", product=" + product + ", productID=" + productID + "]";
	}
}
