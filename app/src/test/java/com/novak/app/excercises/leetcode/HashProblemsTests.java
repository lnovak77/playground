package com.novak.app.excercises.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HashProblemsTests {
	private static HashProblems solution;

	@BeforeAll
	public static void init()
	{
		solution= new HashProblems();
	}
	@Test
	public void testIsUnique()
	{
		Assertions.assertEquals(solution.findTheDifference("abcd", "abcde"), "e");
	}
}
