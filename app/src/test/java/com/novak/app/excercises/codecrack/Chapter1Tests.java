package com.novak.app.excercises.codecrack;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Chapter1Tests {
	private static Chapter1 chapter;

	@BeforeAll
	public static void init()
	{
		chapter= new Chapter1();
	}
	@Test
	public void testIsUnique()
	{
		Assertions.assertTrue(chapter.isUnique("asdfgHJKUT"),"Positive test");
		Assertions.assertFalse(chapter.isUnique("asdfgHaJKUT"),"Positive test");
	}
	
	@Test
	public void testIsPermutation()
	{
		Assertions.assertTrue(chapter.isPermutation(null,null),"bot nulls");
		Assertions.assertFalse(chapter.isPermutation(null,"sda"),"null not null");
		Assertions.assertFalse(chapter.isPermutation("dasfdafds","sdad"),"different size");
		Assertions.assertFalse(chapter.isPermutation("dasf","sdad"),"same size different chars");
		Assertions.assertTrue(chapter.isPermutation("dasf","sfda"),"same size same chars");
	}

}
