package a1;

import java.util.ArrayList;

public class Customer {
	private String fname;
	private String lname;
	private ArrayList<Item> items;
	
	Customer(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		items = new ArrayList<Item>();
	}
	
	String getFullName() {
		return fname + " " + lname;
	}
	
	String getShortName() {
		return fname.substring(0, 1) + ". " + lname;
	}
	
	void addItem(int quantity, String name, double price) {
		items.add(new Item(quantity, name, price));
	}
	
	double getTotal() {
		double total = 0;
		for(int i = 0; i < items.size(); i++) {
			total += items.get(i).getTotal();
		}
		return total;
	}
}
