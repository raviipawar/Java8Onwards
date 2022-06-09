/**
 * 
 */
package com.java.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author R@vindRA
 *
 */
public class StreamMore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find numbers that starts with 1

		List<Integer> l1 = Arrays.asList(121, 1, 1, 2, 3, 11, 14);

		l1.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

		// find duplicates
		/*
		 * Set<Integer> s1 = new HashSet(); l1.stream().filter(n ->
		 * s1.add(n)).collect(Collectors.toSet());
		 * 
		 * Iterator itr = s1.iterator(); while (itr.hasNext()) {
		 * System.out.println("set elements" + itr.next());
		 */

		// find first element of list
		l1.stream().findFirst().ifPresent(System.out::println);

		// count of total elements
		long count = l1.stream().count();
		System.out.println("Total no of elements :" + count);

		// sort the elements
		l1.stream().sorted().forEach(System.out::println);

		// sort in descending order
		l1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
