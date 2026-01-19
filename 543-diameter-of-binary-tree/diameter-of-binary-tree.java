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
       //optimal solution
       //t.c:o(n)
        return dfs(root)[1]; // second element is diameter
    }

    // returns {height, diameter}
    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int height = 1 + Math.max(left[0], right[0]);
        int diameter = Math.max(left[1], Math.max(right[1], left[0] + right[0]));

        return new int[]{height, diameter};
    }
}