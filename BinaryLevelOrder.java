package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
102. Binary Tree Level Order Traversal

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).


Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000

 */


public class BinaryLevelOrder {

	List<List<Integer>> res = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		levelOrder();
		
	}
	
	public static void levelOrder(){
		
        if(root == null){
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            List<Integer> l = new ArrayList<>();
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                l.add(curr.val);
            }
            res.add(l);
        }
        return res;
	}
}
