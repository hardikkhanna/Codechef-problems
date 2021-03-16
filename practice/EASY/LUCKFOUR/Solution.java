package com.codechef.problems.beginner;

import java.util.Scanner;

public class Solution{

		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			char[] str = String.valueOf(n).toCharArray();
			int c = 0;
			for (int i = 0; i < str.length; i++) {
				if (str[i] == '4') {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}
