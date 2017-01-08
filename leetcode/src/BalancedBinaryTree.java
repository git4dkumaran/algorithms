/**
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
**/


public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }
        
        if (height(node) < 0) {
            return false;
        }
        
        return true;
    }
    
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int left = height(node.left);
        if (left < 0) {
            return left;
        }
        int right = height(node.right);
        if (right < 0) {
            return right;
        }
        
        if ((left - right) > 1 || (right - left) > 1) {
            return -1;
        }
        
        return 1 + Math.max(left, right);
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
