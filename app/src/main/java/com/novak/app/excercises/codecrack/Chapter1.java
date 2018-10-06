package com.novak.app.excercises.codecrack;

import java.util.HashMap;
import java.util.HashSet;

public class Chapter1 {
	/* Excercise 1.1. */
	public  boolean isUnique(String s)
	{
		HashSet<Character> dict = new HashSet<>();
		for (char c:s.toCharArray()) if (!dict.add(c)) return false;
		//second co hi  mt
		return true;	
	}
	
	/* Excercise 1.2*/
	public  boolean isPermutation(String s1, String s2)
	{
		if (((s1==null)^(s2==null))) return false;
		if (s1==null) return true;
		if (s1.length()!=s2.length()) return false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for (char c: s1.toCharArray()) hm.compute(c, (k,v)->(v==null)?1:v+1);
		for (char c: s2.toCharArray()) {int val= hm.compute(c, (k,v)->(v==null)?-1:v-1);if (val<0) return false;}
		return true;
	}
	
	/* Excercise 1.4*/
	public  boolean isPaliPermutation(String s1)
	{
	    int[] dict = new int[26];
	    for (char c:s1.toLowerCase().toCharArray())
	    {
	    	if (!Character.isWhitespace(c)) dict[c-'a']++;
	    }
	    
	    boolean hasOdd=false;
	    for (int v:dict)
	    {
	    	if (v%2==1)
	    	{
	    		if (hasOdd) return false;
	    		hasOdd=true;
	    	}
	    }
	    return true;
	}
	
	/*Excercise 1.5*/
	public boolean oneAway(String s1, String s2)
	{
		int lgdif=s1.length()-s2.length();
		if (Math.abs(lgdif)>1) return false;
		String lg=(lgdif>0)?s1:s2;
		String sh=(lg==s2)?s1:s2;
		int posShf=0;		
		boolean misMatchFound = false;
		for (int i=0; i<sh.length(); i++)
		{
			if (lg.charAt(i+posShf)!=sh.charAt(i))
			{
				if (misMatchFound) return false;
				misMatchFound=true;
				if (lgdif!=0) {posShf=1; i--;}
			}
		}
		return true;
	}
	
	/*Excercise 1.6*/
	public String stringCompression (String input)
	{
		StringBuilder stb= new StringBuilder(input.length());
		char lchar=0;
		int ccnt =0;
		for (char c:input.toCharArray())
		{
			if (c==lchar) ccnt++;
			else
			{
				if (lchar!=0) 
					stb.append(lchar).append(ccnt);
				lchar=c;
				ccnt=1;
				if (stb.length()>input.length()) return input;
			}
		}
		if (lchar!=0)
			stb.append(lchar).append(ccnt);
		if (stb.length()>input.length()) return input;
		return stb.toString();
		
	}
	
	/* Excercise 1.7 */
	public void rotateMatrix(int[][] matrix)
	{
		int lgth=matrix.length;
		int loops=lgth/2;
		for (int i=0;i<loops;i++)
		{
			for (int j=i;j<matrix.length-i-1;j++)
			{
			
				int tmp= matrix[lgth-1-j][i];
				 matrix[lgth-1-j][i]= matrix[lgth-1-i][lgth-1-j];
				 matrix[lgth-1-i][lgth-1-j]= matrix[j][lgth-i-1];
				 matrix[j][lgth-i-1] = matrix[i][j];
				 matrix[i][j]=tmp;
			}
		}
	}
	
	/* Excercise 1.8 */
	public void zeroMatrix(int[][] matrix)
	{
		int lgth=matrix.length;
		int wdth=matrix[0].length;
		boolean isZCol[]=new boolean[lgth];
		boolean isZRow[]=new boolean[wdth];
		for (int i=0;i<lgth;i++)
			for (int j=0;j<wdth;j++) if (matrix[i][j]==0) isZCol[j]=(isZRow[i]=true);
		for (int i=0;i<lgth;i++)
			for (int j=0;j<wdth;j++) if ( isZCol[j]||isZRow[i]) matrix[i][j]=0;
			
	}
	/* Excercise 1.9 */
	public boolean isRotation(String s1, String s2)
	{
		if (s1.length()!=s2.length()) return false;
		return (s1+s1).contains(s2);
	}

}
