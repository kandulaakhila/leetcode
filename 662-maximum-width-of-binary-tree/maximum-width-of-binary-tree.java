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
 //t.c=o(n)
 //s.c=o(n);
 class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;//stores max width so far
        Queue<Pair>q=new LinkedList<>();//bfs queue
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();//no.of nodes in a current level
            int min=q.peek().num;//smallest index at this level(used to normalise indices to avoid overflow)
            int first=0,last=0;//track leftmost and right most indices
            for(int i=0;i<size;i++){
                int cur_id=q.peek().num-min;//prevent overflow
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first=cur_id;//first node in a level
                if(i==size-1) last=cur_id;//last node in a level
                //add children to the queue
                if(node.left!=null)
                q.offer(new Pair(node.left,cur_id*2+1));
                if(node.right!=null)
                q.offer(new Pair(node.right,cur_id*2+2));
            }
            ans=Math.max(ans,last-first+1);//width of the current level
        }
        return ans;
    }
}