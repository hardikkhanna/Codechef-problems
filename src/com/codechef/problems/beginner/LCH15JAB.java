package com.codechef.problems.beginner;

public class LCH15JAB {

	/*
	 * This is a very easy warm-up problem.
	 * 
	 * You are given a string. Your task is to determine whether number of
	 * occurrences of some character in the string is equal to the sum of the
	 * numbers of occurrences of other characters in the string.
	 * 
	 * Input The first line of the input contains an integer T denoting the number
	 * of test cases. Each of the next T lines contains one string S consisting of
	 * lowercase latin letters.
	 * 
	 * Output For each test case, output a single line containing "YES" if the
	 * string satisfies the condition given above or "NO" otherwise.
	 */
	
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
