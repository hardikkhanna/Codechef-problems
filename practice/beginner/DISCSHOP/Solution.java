package com.codechef.problems.beginner;

import java.util.Scanner;



public class Solution{
	
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
