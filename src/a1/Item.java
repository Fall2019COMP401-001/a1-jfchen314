package a1;

public class Item {
	private int quantity;
	private String name;
	private double price;
	
	Item(int quantity, String name, double price) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getCount() {
		return quantity;
	}
	
	double getPrice() {
		return price;
	}
	
	double getTotal() {
		return quantity * price;
	}
	
	void add(int num) {
		quantity += num;
	}
}
