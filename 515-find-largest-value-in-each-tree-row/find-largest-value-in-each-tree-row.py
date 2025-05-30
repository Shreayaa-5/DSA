# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        if root is None:
            return [] 
        queue=[root]
        l=[]
        while queue:
            n=len(queue)
            r=[]
            for i in range(n):
                node=queue.pop(0)
                r.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            l.append(max(r))
        return l