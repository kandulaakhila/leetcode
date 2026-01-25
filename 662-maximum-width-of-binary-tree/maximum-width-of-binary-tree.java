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
 //
 //t.c=o(n);//every node visited once
 //s.c=o(h);//recursive stack+map storing one index per depth, H i sthe height of the tree(log n for balanced,n for skewed)
class Solution {
    int ans=0;//keep track of max width found so far
    Map<Integer, Integer>leftmost=new HashMap<>();//stores first index seen at each deth
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root,0,0);
        return ans;
    }
    private void dfs(TreeNode node,int depth,int pos){
    if(node==null) return;//if node is null stop recursion
    leftmost.putIfAbsent(depth,pos);//store leftmost index at this depth
    ans=Math.max(ans, pos-leftmost.get(depth)+1);//calculate width at this depth
    //recursive left and right
    dfs(node.left,depth+1,pos*2+1);
    dfs(node.right,depth+1,pos*2+2);
}
}