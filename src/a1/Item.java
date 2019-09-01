package a1;

public class Item {
	private int quantity;
	private String name;
	private double price;

	/**
	 * Item class holds some info about each item that exists, both in the store and
	 * in a customer's inventory
	 * 
	 * @param quantity How much of item to start with
	 * @param name     Name of item
	 * @param price    Price of item
	 */
	Item(int quantity, String name, double price) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}

	/**
	 * Returns name of item
	 * 
	 * @return name of item
	 */
	String getName() {
		return name;
	}

	/**
	 * Returns quantity of item
	 * 
	 * @return quantity of item
	 */
	int getCount() {
		return quantity;
	}

	/**
	 * Returns price of item
	 * 
	 * @return price of item
	 */
	double getPrice() {
		return price;
	}

	/**
	 * Returns total price of items
	 * 
	 * @return total price of items
	 */
	double getTotal() {
		return quantity * price;
	}

	/**
	 * Adds a certain number to the total quantity
	 * 
	 * @param num How much to add
	 */
	void add(int num) {
		quantity += num;
	}
}
