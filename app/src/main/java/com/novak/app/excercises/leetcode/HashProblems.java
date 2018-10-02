package com.novak.app.excercises.leetcode;

public class HashProblems {
	/* 389. Find the Difference */
    public char findTheDifference(String s, String t) {
        int[] dict =new int[26];
        for (char c : s.toCharArray()) dict[c-'a']++;
        for (char c : t.toCharArray()) if ((--dict[c-'a'])<0) return c;
        return 'a';
    }

}
