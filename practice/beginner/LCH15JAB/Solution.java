package com.codechef.problems.beginner;

import java.util.Scanner;

public class Solution{
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    int max=0;
		    for(int i=0;i<s.length();i++)
		    {
		        int count=0;
		        for(int j=0;j<s.length();j++)
		        {
		            if(s.charAt(i)==s.charAt(j))
		            {
		                count+=1;
		            }
		        }
		        if(count>max)
		        {
		            max=count;
		        }
		    }
		    if(max==s.length()-max)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    max=0;
		}
	}

}
