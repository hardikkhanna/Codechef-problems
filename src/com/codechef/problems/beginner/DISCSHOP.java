package com.codechef.problems.beginner;

import java.util.Scanner;

/*All submissions for this problem are available.I have a habit of asking for discounts when I'm buying something. Before you rush to call me a miser, let me tell you that I only ask for discounts if I have to pay at least 10 Rs, since asking for a discount on something that can be paid with just a few coins is really rude.

One day, I was supposed to pay N Rs, but the shopkeeper gave me an unusual offer - he told me that I can remove one of the digits in the decimal representation of N and pay only the resulting price. I am trying to figure out the minimum price I have to pay if I choose the digit to remove optimally. Would you help me, please?

Note that the resulting number after removing digit is allowed to have leading zeros. But while outputting the answer, there should be no leading zeros.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.
Output
For each test case, print a single line containing one integer - the minimum price I have to pay.*/

public class DISCSHOP {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		while(t -- > 0){
			int n = sc.nextInt();
		    discshop(n);
		}
	}
	private static void discshop(int n){
	    String conv = String.valueOf(n);
	    
	    int min  = Integer.MAX_VALUE;
	    for(int i = 0;i<conv.length();i++){
	        StringBuilder str = new StringBuilder(conv);
	        str.deleteCharAt(i);
	        int out = Integer.parseInt(str.toString());
	        //System.out.print(out + " ");
	        if(out < min){
	            min = out;
	        }
	    }
	    System.out.println(min);
	}
}
