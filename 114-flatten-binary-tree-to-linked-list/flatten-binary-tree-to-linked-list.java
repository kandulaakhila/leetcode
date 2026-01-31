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
 //s.c:o(h)average,o(n)worst case
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur=st.pop();
            if(cur.right!=null){
                st.push(cur.right);
            }
            if(cur.left!=null){
                st.push(cur.left);
            }
            if(!st.isEmpty()){
                cur.right=st.peek();
            }
            cur.left=null;
        } 
    }
}