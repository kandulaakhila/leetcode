/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       //brute forces Solution
       if (root == null) return 0;
       //t.c=o(n^2);//bcz height is recomputed for each node
       //s.c:o(h) recursive stack,where h=tree height
      // .Worst case (skewed tree): O(n).
      //.Best case (balanced tree): O(\log n)
        int left = height(root.left);
        int right = height(root.right);
        int diameterThroughRoot = left + right;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(diameterThroughRoot, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}