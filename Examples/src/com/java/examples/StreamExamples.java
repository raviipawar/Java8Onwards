/**
 * 
 */
package com.java.examples;

import java.util.Arrays;
import java.util.List;

/**
 * @author R@vindRA
 *
 */
public class StreamExamples {

	/**
	 * find all even numbers in a list 
	 */
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 12, 15, 17, 18, 4, 6, 3);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		System.out.println("hellos");
	}
}
