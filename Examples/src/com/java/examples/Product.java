/**
 * 
 */
package com.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ravpawar
 *
 */
public class Product {

	int salary;
	String name;

	public Product(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(20000, "Ravi"));
		productList.add(new Product(40000, "Aavi"));
		productList.add(new Product(60000, "Savi"));
		productList.add(new Product(50000, "Favi"));
		productList.add(new Product(90000, "Cavi"));

		List<Integer> priceList =  productList.stream().filter(p->p.salary>30000)
				.map(Product::getSalary)
				.collect(Collectors.toList());
		
		System.out.println(priceList);

	}

}
