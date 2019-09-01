package a1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String fname;
	private String lname;
	private List<Item> items;

	/**
	 * Customer class mainly holds the name and list of bought items for any
	 * customer
	 * 
	 * @param fname First name
	 * @param lname Last name
	 */
	Customer(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		items = new ArrayList<Item>();
	}

	/**
	 * Gets full name, which is full first plus last name
	 * 
	 * @return Full name
	 */
	String getFullName() {
		return fname + " " + lname;
	}

	/**
	 * Gets shortened name, which is just first initial with a dot and last name
	 * 
	 * @return Shortened name
	 */
	String getShortName() {
		return fname.substring(0, 1) + ". " + lname;
	}

	/**
	 * Add an item to the list, if there's a duplicate, add the quantities instead.
	 * Note: Prices matter! If there are 2 separate prices, then they will not
	 * combine.
	 * 
	 * @param quantity Number of new item
	 * @param name     Name of new item
	 * @param price    Price of new item
	 */
	void addItem(int quantity, String name, double price) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getName().equals(name) && items.get(i).getPrice() == price) {
				items.get(i).add(quantity);
				return;
			}
		}
		items.add(new Item(quantity, name, price));
	}

	/**
	 * Returns total of all the totals of each item. Basically how much customer
	 * spent.
	 * 
	 * @return Total spent
	 */
	double getTotal() {
		double total = 0;
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getTotal();
		}
		return total;
	}

	/**
	 * Returns count for a certain item
	 * 
	 * @param name Name of item
	 * @return Count for that item
	 */
	int getItem(String name) {
		for (Item i : items) {
			if (i.getName().equals(name))
				return i.getCount();
		}
		return 0;
	}
}
