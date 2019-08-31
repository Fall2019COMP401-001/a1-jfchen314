package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] store;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		int count = scan.nextInt();
		store = new String[count];
		for(int i = 0; i < count; i++) {
			store[i] = scan.next();
			scan.nextDouble();
		}
		
		count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			Customer cust = new Customer(scan.next(), scan.next());
			int itemCount = scan.nextInt();
				for(int j = 0; j < itemCount; j++) {
					cust.addItem(scan.nextInt(), scan.next(), 0);
				}
			customers.add(cust);
		}
		scan.close();
		for(String i : store) {
			int custCount = 0;
			int itemCount = 0;
			for(Customer c: customers) {
				if(c.getItem(i) > 0) custCount++;
				itemCount += c.getItem(i);
			}
			if(custCount > 0) 
				System.out.println(custCount + " customers bought " + itemCount + " " + i);
			else
				System.out.println("No customers bought " + i);
		}
	}
}
