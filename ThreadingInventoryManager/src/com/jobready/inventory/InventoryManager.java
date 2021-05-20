package com.jobready.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
//  ARRAYLIST NOT THREAD SAFE
//	List<Product> soldProducts = new ArrayList<Product>();
//	List<Product> purchasedProducts = new ArrayList<Product>();
	
	List<Product> soldProducts = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProducts = new CopyOnWriteArrayList<Product>();
	
	public void populateSoldProducts() {
		for (int i = 0; i < 1000; i++) {
			Product p = new Product(i, "test_product_" + i);
			soldProducts.add(p);
			System.out.println("ADDED: " + p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void displaySoldProducts() {
		for (Product p : soldProducts) {
			System.out.println("SOLD: " + p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
