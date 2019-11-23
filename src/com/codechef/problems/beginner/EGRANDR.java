package com.codechef.problems.beginner;

import java.util.HashSet;
import java.util.Scanner;

public class EGRANDR {

	/*
	 * Andrash study in Uzhland National University. Now is the time of exam
	 * results. Andrash similar to other students, hopes that this scores in the
	 * exam could fetch him a scholarship/stipendium for his studies.
	 * 
	 * There are following simple rules to receive stipendium:
	 * 
	 * University follows 5 point grading system. In an exam, a student can receive
	 * any score from 2 to 5. 2 is called an F grade, meaning that student has
	 * failed that exam. Student should not have fail any of the exams. Student must
	 * obtain a full score in some of his/her exams to show that he/she is excellent
	 * in some of the subjects. He/She must have a grade point average not less than
	 * 4.0 You are given information regarding the exams and how Andrash performed
	 * in those. Can you help him figure out whether he will receive the stipendium
	 * or not!!
	 * 
	 * Input The first line of input contains a single integer T denoting the number
	 * of test cases. This will be followed by T test cases.
	 * 
	 * The first line of each test case contains an integer N denoting the number of
	 * examinations.
	 * 
	 * The next line of each test case contains N space separated integers denoting
	 * Andrash's score for each exam.
	 * 
	 * Output For each of the T test cases, output a single line - "Yes" (without
	 * quotes) if Andrash will receive stipendium, or "No" (without quotes) -
	 * otherwise.
	 */

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
