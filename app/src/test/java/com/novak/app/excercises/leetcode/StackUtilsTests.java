package com.novak.app.excercises.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StackUtilsTests {
	private static StackProblems solution;

	@BeforeAll
	public static void init()
	{
		solution= new StackProblems();
	}
	@Test
	public void testIsUnique()
	{
		Assertions.assertEquals(solution.decodeString("3[a]2[bc]"), "aaabcbc"," failed test 1");
		Assertions.assertEquals(solution.decodeString("3[a2[c]]"), "accaccacc"," failed test 2");
		Assertions.assertEquals(solution.decodeString("2[abc]3[cd]ef"),"abcabccdcdcdef"," failed test 3");
		
	
	}
	
}
