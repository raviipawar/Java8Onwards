/**
 * 
 */
package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		List<Integer> ls = new ArrayList<>();
		ls = myList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(ls);
	}
}
