package com.model;

public class Snack 
{
	private int id;
	private String name;
	private int price;
	private String desc;
	
	public Snack(int id, String name, int price, String desc) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "id=" + id + "   name=" + name + "   price=" + price + "   desc=" + desc;
	}
	
	
	
	

}
