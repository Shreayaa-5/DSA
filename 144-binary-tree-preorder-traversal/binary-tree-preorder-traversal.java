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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        Preorder(root,ll);
        return ll;
    }
    public void Preorder(TreeNode root,List<Integer> ll){
        if(root!=null){
            ll.add(root.val);
            Preorder(root.left,ll);
            Preorder(root.right,ll);
        }
    }
}