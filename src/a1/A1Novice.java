package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		// Your code follows here.
		
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			Customer cust = new Customer(scan.next(), scan.next());
			int itemCount = scan.nextInt();
			for(int j = 0; j < itemCount; j++) {
				cust.addItem(scan.nextInt(), scan.next(), scan.nextDouble());
			}
			customers.add(cust);
		}
		scan.close();
		System.out.println(customers.size());
		for(Customer c : customers) {
			System.out.println(
					c.getShortName() + ": " + String.format("%.2f", c.getTotal()));
		}
	}
}
