package com.codechef.problems.beginner;

import java.util.Scanner;

public class LUCKFOUR {

	/*
	 * Kostya likes the number 4 much. Of course! This number has such a lot of
	 * properties, like:
	 * 
	 * Four is the smallest composite number; It is also the smallest Smith number;
	 * The smallest non-cyclic group has four elements; Four is the maximal degree
	 * of the equation that can be solved in radicals; There is four-color theorem
	 * that states that any map can be colored in no more than four colors in such a
	 * way that no two adjacent regions are colored in the same color; Lagrange's
	 * four-square theorem states that every positive integer can be written as the
	 * sum of at most four square numbers; Four is the maximum number of dimensions
	 * of a real division algebra; In bases 6 and 12, 4 is a 1-automorphic number;
	 * And there are a lot more cool stuff about this number! Impressed by the power
	 * of this number, Kostya has begun to look for occurrences of four anywhere. He
	 * has a list of T integers, for each of them he wants to calculate the number
	 * of occurrences of the digit 4 in the decimal representation. He is too busy
	 * now, so please help him.
	 * 
	 * Input The first line of input consists of a single integer T, denoting the
	 * number of integers in Kostya's list.
	 * 
	 * Then, there are T lines, each of them contain a single integer from the list.
	 * 
	 * Output Output T lines. Each of these lines should contain the number of
	 * occurences of the digit 4 in the respective integer from Kostya's list.
	 */	
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
