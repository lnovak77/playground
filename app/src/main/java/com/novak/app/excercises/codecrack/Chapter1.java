package com.novak.app.excercises.codecrack;

import java.util.HashSet;

public class Chapter1 {
	public  boolean isUnique(String s)
	{
		HashSet<Character> dict = new HashSet<>();
		for (char c:s.toCharArray()) if (!dict.add(c)) return false;
		return true;	
	}					

}
