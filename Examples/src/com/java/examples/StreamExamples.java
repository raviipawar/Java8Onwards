/**
 * 
 */
package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author R@vindRA
 *
 */
public class StreamExamples {

	
	/**
	 * find all even numbers in a list
	 */
	public static void main(String[] args) {
		// Intermediate operation Filter
		List<Integer> myList = Arrays.asList(10, 12, 15, 17, 18, 4, 6, 3);
		List<Integer> ls = new ArrayList<>();
		ls = myList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers :" + ls);

		// Intermediate operation Map
		List<Integer> marks = Arrays.asList(35, 24, 33, 56, 78, 98);
		List<Integer> updatedMarks = new ArrayList<>();
		updatedMarks = marks.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("Updated Marks :" + updatedMarks);

		// Intermediate operation Sorted
		List<Integer> age = Arrays.asList(22, 12, 33, 42, 56, 26);
		List<Integer> sortByage = new ArrayList<>();
		sortByage = age.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Age :" + sortByage);
		
		//Find max 
		List<Integer> wage = Arrays.asList(22, 12, 33, 42, 56, 26);
		int maxWage = wage.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxWage);
		
		Integer maxNumber = Stream.of(1,3,5,7,9,11)
		          .max(Comparator.comparing(Integer::valueOf))
		          .get();
		System.out.println("Max number :"+maxNumber);
		
		
		//Find min
		List<Integer> wage1 = Arrays.asList(22, 12, 33, 42, 56, 26);
		int minWage = wage1.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minWage);
		
		Integer minNumber = Stream.of(1,3,5,7,9,11)
		          .min(Comparator.comparing(Integer::valueOf))
		          .get();
		System.out.println("Min number :"+minNumber);
		
		//Find count 
		List<Integer> wage2 = Arrays.asList(1,22, 12, 33, 42, 56, 26);
		int count = (int) wage2.stream().filter(n->n<20).count();
		System.out.println(count);
		
		//List to Set
		List<Integer> wage3 = Arrays.asList(1,22, 1,12,12, 33, 42, 56, 26);
		Set<Integer> set = wage3.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		//Random numbers in sorted order
		Random random =  new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);
		
		//add all numbers in list
		int sum;
		sum = wage1.stream().mapToInt(Integer ::intValue).sum();
		System.out.println("Total sum :"+sum);
	}
}
