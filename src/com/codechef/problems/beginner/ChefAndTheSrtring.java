package com.codechef.problems.beginner;

import java.util.Scanner;

public class ChefAndTheSrtring {

	/*
	 * Chef likes playing with strings. The most interesting game are named
	 * "CHEF in string". The move of the game consists of the following: Chef takes
	 * a subsequence of string's letters that form the word "CHEF" and then he
	 * removes that symbols. The goal of the game is to make the maximal number of
	 * moves. Please, help Chef and tell him the maximal possible number of moves
	 * that he is able to make for the given string S.
	 * 
	 * Input The first line of each test case contains a given string. This string
	 * consists of uppercase letters from the set {"C", "H", "E", "F"}.
	 * 
	 * Output Output a single line containing the maximal possible number of moves.
	 */

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
