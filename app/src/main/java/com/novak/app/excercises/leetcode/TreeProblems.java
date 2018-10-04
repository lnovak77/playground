package com.novak.app.excercises.leetcode;

public class TreeProblems {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	//700. Search in a Binary Search Tree
	public TreeNode searchBST(TreeNode root, int val) {
		while (root!=null && root.val!=val)
		{
			if (root.val<val) root=root.right;
			else root=root.left;
		}
		return root;
	}

}
