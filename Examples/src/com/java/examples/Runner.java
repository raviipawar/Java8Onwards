/**
 * 
 */
package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author R@vindRA
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 12, 15, 17, 18, 4, 6, 3);
		StreamExamples se = new StreamExamples();
		se.getEven(myList);

	}

}
