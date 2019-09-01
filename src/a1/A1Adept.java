package a1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class A1Adept {
	/**
	 * Helper function to format prices
	 * 
	 * @param price Price to format
	 * @return Formatted price
	 */
	static private String priceFormat(double price) {
		return String.format("%.2f", price);
	}

	public static void main(String[] args) {
		// Input everything through stdin
		Scanner scan = new Scanner(System.in);
		Hashtable<String, Double> store = new Hashtable<String, Double>();
		List<Customer> customers = new ArrayList<Customer>();

		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			store.put(scan.next(), scan.nextDouble()); // Add items into store
		}
		count = scan.nextInt();

		// Add customers
		for (int i = 0; i < count; i++) {
			Customer cust = new Customer(scan.next(), scan.next());
			int itemCount = scan.nextInt();
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				cust.addItem(quantity, name, store.get(name));
			}
			customers.add(cust);
		}
		scan.close();
		Customer big = customers.get(0);
		Customer small = customers.get(0);
		double average = 0;

		// Find max/min customer and print
		for (Customer c : customers) {
			if (c.getTotal() > big.getTotal()) {
				big = c;
			} else if (c.getTotal() < small.getTotal()) {
				small = c;
			}
			average += c.getTotal();
		}
		System.out.println("Biggest: " + big.getFullName() + " (" + priceFormat(big.getTotal()) + ")");
		System.out.println("Smallest: " + small.getFullName() + " (" + priceFormat(small.getTotal()) + ")");
		System.out.println("Average: " + priceFormat(average / customers.size()));
	}
}
