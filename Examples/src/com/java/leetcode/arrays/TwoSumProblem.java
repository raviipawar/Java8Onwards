package com.java.leetcode.arrays;

public class TwoSumProblem {

	public int[] twoSum(int[] nums, int target) {
		int L = 0, n = nums.length, R = n - 1;
		while (L < R) {
			int sum = nums[L] + nums[R];
			if (sum == target) {
				System.out.println(L+1);
				System.out.println(R+1);
				return new int[] { L + 1, R + 1 };
				
			} else if (sum < target) {
				L++;
			} else {
				R--;
			}
			
		}
		return new int[] { -1, -1 };
	}	
		public static void main(String[] args) {
			TwoSumProblem t1 = new TwoSumProblem();
			int[] nums = { 1, 5, 7, 9, 22, 3, 4, 5 };
			int target = 4;
			t1.twoSum(nums, target);
		}
	}

	