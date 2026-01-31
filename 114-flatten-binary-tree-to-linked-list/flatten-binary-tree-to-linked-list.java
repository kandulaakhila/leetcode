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
 //t.c:o(n);
 //s.c:o(1);
class Solution {
    public void flatten(TreeNode root) {
         TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                // Find the rightmost node of the left subtree
                TreeNode prev = cur.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                // Connect that rightmost node to current node's right subtree
                prev.right = cur.right;
                // Move the left subtree to the right
                cur.right = cur.left;
                cur.left = null;
            }
            // Move to the next node (always on the right)
            cur = cur.right;
        }
    }
}