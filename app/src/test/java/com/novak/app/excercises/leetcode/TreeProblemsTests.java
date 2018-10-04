package com.novak.app.excercises.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.novak.app.excercises.leetcode.TreeProblems.TreeNode;

public class TreeProblemsTests {
	private static TreeProblems solution;

	@BeforeAll
	public static void init()
	{
		solution= new TreeProblems();
	}
	@Test
	public void testIsUnique()
	{
		TreeProblems.TreeNode n1= new TreeNode(4);
		TreeProblems.TreeNode n2= new TreeNode(2);
		TreeProblems.TreeNode n3= new TreeNode(7);
		TreeProblems.TreeNode n4= new TreeNode(1);
		TreeProblems.TreeNode n5= new TreeNode(3);
		n1.left = n2;
		n1.right= n3;
		n2.left = n4;
		n2.right = n5;
				
		Assertions.assertEquals(solution.searchBST(n1, 2),n2);
		Assertions.assertEquals(solution.searchBST(n1, 5),null);
		
	
	}
}
