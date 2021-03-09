package com.codechef.problems.beginner;

import java.util.Scanner;

public class Solution{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			int c = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != 'N') {
					if (str.charAt(i) == 'Y') {
						System.out.println("NOT INDIAN");
						c = 1;
						break;
					} else if (str.charAt(i) == 'I') {
						System.out.println("INDIAN");
						c = 1;
						break;
					}
				}
			}
			if (c == 0) {
				System.out.println("NOT SURE");
			}

		}

	}

}
