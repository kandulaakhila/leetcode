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
 //s.c:o(h);
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>>result=new ArrayList<>();
       if(root==null) return result;//if queue is empty return an empty list

       Queue<TreeNode>nodesQueue=new LinkedList<>();//use queue for bfs(bfsprocesslevelbylevel)
       nodesQueue.offer(root);//adding root node to the queue
       boolean leftToRight=true;//flag to track direction- firstlevel->lefttoright

       //nextlevel->rightToleft then flip again
       while(!nodesQueue.isEmpty()){//loop until all nodes are processed
       int size=nodesQueue.size();//no.of nodes in current level
       List<Integer>row=new ArrayList<>(size);//temporarylisttostore valuesof the current level

       for(int i=0;i<size;i++){//process each node in the current level
       TreeNode node=nodesQueue.poll();

       if(leftToRight)row.add(node.val);
       else row.add(0,node.val);
       
       if(node.left!=null) nodesQueue.offer(node.left);
       if(node.right!=null) nodesQueue.offer(node.right);
       }
       result.add(row);
       leftToRight=!leftToRight;
       }
       return result;
       }
    }

