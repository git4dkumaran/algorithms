/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

**/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        
        if (root == null) {
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        
        
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        current.add(root);
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        while (!current.isEmpty()) {
            TreeNode node = current.peek();
            current.remove(node);
            list.add(node.val);
            
            if (node.left != null) {
                next.add(node.left);
            }
            
            if (node.right != null) {
                next.add(node.right);
            }
            
            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<TreeNode>();
                
                result.add(list);
                list = new ArrayList<Integer>();
            }
        }
        
        return result;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
