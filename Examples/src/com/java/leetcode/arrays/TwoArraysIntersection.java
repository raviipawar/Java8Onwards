package com.java.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class TwoArraysIntersection {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums1) {
			set.add(i);
		}

		HashSet<Integer> intersection = new HashSet<Integer>();
		for (int i : nums2) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}

		int[] result = new int[intersection.size()];
		int index = 0;
		for (int i : intersection) {
			result[index++] = i;
		}
		for (int i : result) {
			System.out.println(i);
		}
		return result;
	}

	public static void main(String[] args) {
		TwoArraysIntersection t1 = new TwoArraysIntersection();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		t1.intersection(nums1, nums2);
	}

}
