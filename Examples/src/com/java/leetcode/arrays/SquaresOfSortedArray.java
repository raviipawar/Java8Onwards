package com.java.leetcode.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.println(i);
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] array = { 2,1, 3, 5, -7, 4 };
		SquaresOfSortedArray s1 = new SquaresOfSortedArray();
		s1.sortedSquares(array);
	}
}
