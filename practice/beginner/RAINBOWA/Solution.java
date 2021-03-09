package com.codechef.problems.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution{

	

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
