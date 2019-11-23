package com.codechef.problems.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RAINBOWA {

	/*
	 * Chef likes all arrays equally. But he likes some arrays more equally than
	 * others. In particular, he loves Rainbow Arrays.
	 * 
	 * An array is Rainbow if it has the following structure:
	 * 
	 * First a1 elements equal 1. Next a2 elements equal 2. Next a3 elements equal
	 * 3. Next a4 elements equal 4. Next a5 elements equal 5. Next a6 elements equal
	 * 6. Next a7 elements equal 7. Next a6 elements equal 6. Next a5 elements equal
	 * 5. Next a4 elements equal 4. Next a3 elements equal 3. Next a2 elements equal
	 * 2. Next a1 elements equal 1. ai can be any non-zero positive integer. There
	 * are no other elements in array.
	 * 
	 * Help Chef in finding out if the given array is a Rainbow Array or not.
	 * 
	 * Input The first line of the input contains an integer T denoting the number
	 * of test cases. The first line of each test case contains an integer N,
	 * denoting the number of elements in the given array. The second line contains
	 * N space-separated integers A1, A2, ..., AN denoting the elements of array.
	 * Output For each test case, output a line containing "yes" or "no" (without
	 * quotes) corresponding to the case if the array is rainbow array or not.
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			Set<Integer> set = new HashSet<>();
			int size = in.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = in.nextInt();
			}
			int left = 0, right = size - 1;
			boolean ans = true;
			while (left <= right) {
				set.add(arr[left]);
				if (arr[left] != arr[right]) {
					ans = false;
					break;
				}
				left++;
				right--;
			}
			if (ans) {
				if (set.size() == 7) {
					for (int i = 1; i < 8; i++) {
						if (!set.contains(i)) {
							ans = false;
							break;
						}
					}
				} else {
					ans = false;
				}
			}
			System.out.println(ans ? "yes" : "no");
		}
	}

	private static void solution(int[] arr, int n) {

		int min = arr[0];
		int[] arr1 = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			arr1[j++] = arr[i];
		}
		if (Arrays.equals(arr, arr1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
