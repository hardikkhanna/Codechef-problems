package com.codechef.problems.beginner;

import java.util.Scanner;

public class Solution{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder s = new StringBuilder(scan.nextLine());
		int count = 0;

		while (true) {
			int indexC = s.indexOf("C");
			if (indexC == -1) {
				break;
			} else {
				int indexH = s.indexOf("H", indexC);
				if (indexH == -1) {
					break;
				} else {
					int indexE = s.indexOf("E", indexH);
					if (indexE == -1) {
						break;
					} else {
						int indexF = s.indexOf("F", indexE);
						if (indexF == -1) {
							break;
						} else {
							s.deleteCharAt(indexF);
							s.deleteCharAt(indexE);
							s.deleteCharAt(indexH);
							s.deleteCharAt(indexC);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count + "");

	}

}
