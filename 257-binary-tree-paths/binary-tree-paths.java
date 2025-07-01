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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) check(root, result, "");
        return result;
    }
    public void check(TreeNode root,List<String> l,String s){
        if(root==null) return;
        s+=root.val;
        if(root.left==null && root.right==null){
            l.add(s);
            return;
        }
        s += "->";
        check(root.left,l,s);
        check(root.right,l,s); 
    }
}