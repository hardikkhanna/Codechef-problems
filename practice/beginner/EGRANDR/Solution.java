package com.codechef.problems.beginner;

import java.util.HashSet;
import java.util.Scanner;

public class Solution{


	public static boolean ch(int a[], int n) {
		int sum = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (a[i] == 2) {
				return false;
			}
			hs.add(a[i]);
			sum += a[i];
		}
		if (!(hs.contains(5))) {
			return false;
		}
		double avg = (double) sum / n;
		if (avg < 4.0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			if (ch(a, n)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
