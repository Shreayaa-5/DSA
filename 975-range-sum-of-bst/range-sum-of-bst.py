# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        w=[]
        count=0
        self.level_order(root,w)
        for i in w:
            if low<=i<=high:
                count+=i
        return count
    def level_order(self,root,s):
        if root is None:
            return 
        queue=[root]
        while queue:
            c=queue.pop(0)
            s.append(c.val)
            if c.left:
                queue.append(c.left)
            if c.right:
                queue.append(c.right)