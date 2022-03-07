package LeetCode;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

Input: root = [2,1,3]
Output: true

Example 2:

Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 */

public class ValidBST extends TreeNode{

	static boolean check = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void checkValid(TreeNode leftNode, TreeNode rightNode, int val){
		
		if(leftNode == null && rightNode == null){
			return;
		}
		
		if(leftNode != null && rightNode == null){
			if(leftNode.val > val){
				check = false;
			}else{
				checkValid(leftNode.left, leftNode.right, leftNode.val);
			}
		}else if(leftNode == null && rightNode != null){
			if(rightNode.val < val){
				check = false;
			}else{
				checkValid(rightNode.left, rightNode.right, rightNode.val);
			}
		}else{
			if(leftNode.val > val || rightNode.val < val){
				check = false;
			}else{
				checkValid(leftNode.left, leftNode.right, leftNode.val);
				checkValid(rightNode.left, rightNode.right, rightNode.val);
			}
		}		
		
	}

}
