package com.novak.app.excercises.codecrack;

import java.util.HashMap;
import java.util.HashSet;

public class Chapter1 {
	public  boolean isUnique(String s)
	{
		HashSet<Character> dict = new HashSet<>();
		for (char c:s.toCharArray()) if (!dict.add(c)) return false;
		//second co hi  mt
		return true;	
	}
	
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

}
