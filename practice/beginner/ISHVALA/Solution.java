package com.codechef.problems.beginner;

import java.util.Scanner;

public class Solution{


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
