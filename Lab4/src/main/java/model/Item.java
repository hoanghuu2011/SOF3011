package model;

import java.util.Date;

public class Item {
	int id;
	String name;
	String image;
	double price;
	double discount;
	Date date = new Date();

	public Item() {
		super();
	}

	public Item(int id, String name, String image, double price, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.discount = discount;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
