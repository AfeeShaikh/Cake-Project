package com.CakeShop;

public class Cake {
	String cname;
	String type;
	String qty;
	double price;

	public Cake(String cname, String type, String qty, double price) {
		this.cname = cname;
		this.type = type;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("`````````````````````````````````````````````````````````````````````````````````````");
		return "Name:" + cname + " Weight:" + qty + " Type:" + type + " Price:₹" + price;

	}
}
