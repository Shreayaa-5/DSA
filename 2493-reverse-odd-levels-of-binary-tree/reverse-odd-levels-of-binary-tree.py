# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def reverseOddLevels(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def dfs(root1,root2,level):
            if not root1 or not root2:
                return 
            if level%2!=0:
                root1.val,root2.val=root2.val,root1.val
            dfs(root1.left,root2.right,level+1)
            dfs(root2.left,root1.right,level+1)
        dfs(root.left,root.right,1)
        return root