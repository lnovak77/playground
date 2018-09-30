package com.novak.app.excercises.leetcode;

import java.util.Stack;

public class StackProblems {
	/* 394. Decode String*/
	public String decodeString(String s) 
	{
		/* The idea behind solution:
		 * we build stack containing number of repitiotions and what to repeat
		 * when we reach ] we pop the stack and add k copies of string to either top of the stack or if empty to
		 * output 
		 * */
		StringBuilder stb=new StringBuilder();
		Stack<Integer> st=new Stack<>();
		Stack<StringBuilder> sb=new Stack<>();  
		for (int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if (Character.isDigit(c))
			{
				int rs=0;
				while (c!='[')
				{
					rs=rs*10+(c-'0');
					i++;
					c=s.charAt(i);
				}
				st.push(rs);
				sb.push(new StringBuilder());
			}
			else    if (c==']')
			{
				int rep=st.pop();
				String b=sb.pop().toString();
				StringBuilder res=(sb.isEmpty())? stb:sb.peek();
				for (int j=0;j<rep;j++) res.append(b);
			}
			else
			{
				StringBuilder res=(sb.isEmpty())? stb:sb.peek();
				res.append(c);
			}
		}
		return stb.toString();
	}

}
