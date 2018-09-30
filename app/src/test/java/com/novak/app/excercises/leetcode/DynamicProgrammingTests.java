package com.novak.app.excercises.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.novak.app.excercises.leetcode.DynamicProgramming;

public class DynamicProgrammingTests {
	private static DynamicProgramming solution;

	@BeforeAll
	public static void init()
	{
		solution= new DynamicProgramming();
	}
	@Test
	public void testIsUnique()
	{
		Assertions.assertEquals(solution.findIntegers(5),5," failed on 5");
		Assertions.assertEquals(solution.findIntegers(1),2," failed on 1");
		Assertions.assertEquals(solution.findIntegers(2),3," failed on 2");
		Assertions.assertEquals(solution.findIntegers(11),8," failed on 11");
		Assertions.assertEquals(solution.findIntegers(115),34," failed on 115");
		Assertions.assertEquals(solution.findIntegers(1000000000),2178309," failed on 1000000000");
	
	}
	
}
