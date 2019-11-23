package com.codechef.problems.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class SMPAIR {

	/*
	 * You are given a sequence a1, a2, ..., aN. Find the smallest possible value of
	 * ai + aj, where 1 ≤ i < j ≤ N.
	 * 
	 * Input The first line of the input contains an integer T denoting the number
	 * of test cases. The description of T test cases follows.
	 * 
	 * The first line of each description consists of a single integer N.
	 * 
	 * The second line of each description contains N space separated integers - a1,
	 * a2, ..., aN respectively.
	 * 
	 * Output For each test case, output a single line containing a single integer -
	 * the smallest possible sum for the corresponding test case.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			solution(arr, n);
		}
	}

	private static void solution(int[] arr, int n) {

		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 1; i < n; i++) {
			if (arr[i] + arr[i - 1] < min) {
				min = arr[i] + arr[i - 1];
			}
		}
		System.out.println(min);

	}

}
