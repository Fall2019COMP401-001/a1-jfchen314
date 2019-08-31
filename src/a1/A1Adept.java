package a1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class A1Adept {

	static private String priceFormat(double price) {
		return String.format("%.2f", price);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Hashtable<String, Double> store = new Hashtable<String, Double>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		// Your code follows here.
		int count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			store.put(scan.next(), scan.nextDouble());
		}
		count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			Customer cust = new Customer(scan.next(), scan.next());
			int itemCount = scan.nextInt();
				for(int j = 0; j < itemCount; j++) {
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
		for(Customer c : customers) {
			if(c.getTotal() > big.getTotal()) {
				big = c;
			} else if(c.getTotal() < small.getTotal()) {
				small = c;
			}
			average += c.getTotal();
		}
		System.out.println(
				"Biggest: " + big.getFullName() + " (" + priceFormat(big.getTotal()) + ")");
		System.out.println(
				"Smallest: " + small.getFullName() + " (" + priceFormat(small.getTotal()) + ")");
		System.out.println(
				"Average: " + priceFormat(average / customers.size()));
	}
}
