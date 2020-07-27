package com.hibernate.com.map;

import java.util.Map;

public class Emp {
	private String id;
	private String name;
	private Map<String,Goods> goods;
	public Emp() {
		System.out.println("Employee projct created!");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Goods> getGoods() {
		return goods;
	}

	public void setGoods(Map<String, Goods> goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", goods=" + goods + "]";
	}
	
	
	
	
}
