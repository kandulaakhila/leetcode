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
     private int maxDiameter = 0;  // global tracker
    public int diameterOfBinaryTree(TreeNode root) {
      //optimal solution
      // Time Complexity: O(n) — each node visited once.
      //Space Complexity: O(h) recursion stack, where h = tree height.

      dfs(root);
        return maxDiameter;
    }

    // DFS returns the height of the subtree
    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        // update diameter at this node
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // return height of this subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

