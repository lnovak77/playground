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
	
	@Test
	public void testIsPaliPermutation()
	{
		Assertions.assertEquals(true, chapter.isPaliPermutation("asdff fgga sd"));
		Assertions.assertEquals(false, chapter.isPaliPermutation("asdff fgga sds"));
		Assertions.assertEquals(true, chapter.isPaliPermutation("asdff gga sd"));
	}
	
	@Test
	public void testoneAway()
	{
		Assertions.assertEquals(true, chapter.oneAway("pale","ple"));
		Assertions.assertEquals(true, chapter.oneAway("pales","pale"));
		Assertions.assertEquals(true, chapter.oneAway("pale","bale"));
		Assertions.assertEquals(false, chapter.oneAway("pale","bake"));
	}
	
	@Test
	public void testStringCompression()
	{
		Assertions.assertEquals("a2b1c5a3", chapter.stringCompression("aabcccccaaa"));
		Assertions.assertEquals("ababcbabd", chapter.stringCompression("ababcbabd"));
	}
	
	@Test
	public void testRotate()
	{
		int[][] input= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		chapter.rotateMatrix(input);
		Assertions.assertArrayEquals(new int[][] {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}}, 
				input);
	}
	
	@Test
	public void testZeroMatrix()
	{
		int[][] input=  {{0,1,1},{1,0,1},{1,1,1}};
		chapter.zeroMatrix(input);
		Assertions.assertArrayEquals(input,new int[][] {{0,0,0},{0,0,0},{0,0,1}});
	}
	
	@Test
	public void testIsRotation()
	{
		
		Assertions.assertEquals(chapter.isRotation("waterbottle", "bottlewater"), true);
	}


}
