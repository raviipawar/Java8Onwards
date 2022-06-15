package com.java.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysIntersectionII {
	public int[] intersection(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int[] ans = new int[length1*length2];
		int i =0, j=0, k = 0;
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		while(i<length1 && j<length2) {
			if(nums1[i] <nums2[j]) {
				i++;
			}else if(nums1[i] > nums2[j]) {
				j++;
			}
			else {
				nums1[k++] = nums1[i++];
				j++;
			}
		}
		ans= Arrays.copyOfRange(nums1, 0, k);
		for (int l : ans) {
			System.out.println(l);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		TwoArraysIntersection t1 = new TwoArraysIntersection();
		int[] nums1 = { 4,9,5};
		int[] nums2 = { 9,4,9,8,4};
		t1.intersection(nums1, nums2);
	}
}
