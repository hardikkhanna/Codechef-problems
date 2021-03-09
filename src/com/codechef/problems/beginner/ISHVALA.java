package com.codechef.problems.beginner;

import java.util.Scanner;

public class ISHVALA {

	/*
	 * All submissions for this problem are available.Years after the Ishval Civil
	 * War, the Ishvalan refugees have now found a safe place for themselves which
	 * is a rectangular piece of land, surrounded by fences.
	 * 
	 * The land can be thought of as a 2d grid which extends N units vertically and
	 * M units horizontally. It is divided into N horizontal rows, which are
	 * numbered from 1 to N, as you move from top to bottom and into M vertical
	 * columns numbered from 1 to M, from left to right.
	 * 
	 * There are X rivers flowing in a horizontal direction, each flowing in a
	 * different row and covering the entire row. Similarly, there are Y rivers
	 * flowing in a vertical direction, each flowing in a different column and
	 * covering the entire column.
	 * 
	 * The people want to build houses of dimensions S×S on the remaining land.
	 * 
	 * What is the maximum number of houses of the given dimensions that could be
	 * built on the remaining land, such that no part of any house is in a river and
	 * no two houses overlap?
	 * 
	 * Input: The first line contains T, the number of test cases. Then the test
	 * cases follow. For each test case, the first line contains N and M. Then the
	 * second line contains X , Y and S denoting the number of rivers flowing
	 * horizontally, number of rivers flowing vertically and the dimension of the
	 * house. The next line contains X integers xi denoting the indices of rows in
	 * which river flows horizontally. The next line contains Y integers yi denoting
	 * the indices of columns in which the river flows vertically. Note:
	 * 
	 * xi and yi are given in increasing order. When X or Y are zero, the line
	 * containing xi and yi is skipped respectively in the input (instead of a blank
	 * line). Output: For each test case, print a single line containing the maximum
	 * number of houses that can be built.
	 * 
	 * Sample Input: 2 7 8 1 2 2 5 4 8 6 5 2 0 1 1 4 Sample Output: 6 20
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][m];
			int x = sc.nextInt();
			int y = sc.nextInt();
			int s = sc.nextInt();
			int[] arrx = new int[x];
			int[] arry = new int[y];
			for (int i = 0; i < x; i++) {
				arrx[i] = sc.nextInt();
			}
			for (int i = 0; i < y; i++) {
				arry[i] = sc.nextInt();
			}
			solution(arr, x, y, s, sc, n, m, arrx, arry);
		}

	}

	private static void solution(int[][] arr, int x, int y, int s, Scanner sc, int n, int m, int[] arrx, int[] arry) {

		/*
		 * if (x != 0 && y != 0) { for (int i = 0; i < n; i++) { for (int j = 0; j < m;
		 * j++) { arr[arrx[i]][arry[i]] = 1; } } }
		 */

		/*
		 * for (int j = 1; j <= arry.length; j++) { for (int i = 1; i <= n; i++) { int
		 * index = arry[j]; arr[i][index] = 1; } }
		 */
		for (int j = 0; j < arrx.length; j++) {
			for (int i = 0; i < n; i++) {
				arr[i][arrx[j]] = 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
