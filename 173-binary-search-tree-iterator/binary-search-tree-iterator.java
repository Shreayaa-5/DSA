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
class BSTIterator {
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack=new Stack<>();
        leftTrav(root);
    }
    private void leftTrav(TreeNode root){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();
        if(node.right!=null)
        {
            leftTrav(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        if(stack.isEmpty())
        {
            return false;
        }
        else{
            return true;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */