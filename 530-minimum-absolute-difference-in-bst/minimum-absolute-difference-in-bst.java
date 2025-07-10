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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        inorder(root,l);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            if(Math.abs(l.get(i)-l.get(i+1))<min) min=Math.abs(l.get(i)-l.get(i+1));
        }
        return min;
    }
    public void inorder(TreeNode root,List<Integer> ll){
        if(root==null) return;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
}