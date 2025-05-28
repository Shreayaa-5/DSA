from typing import Optional, List
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if root is None:
            return 
        queue=[root]
        r=[]
        while queue:
            size=len(queue)
            prev=0
            for _ in range(size):
                temp=queue.pop(0)
                prev+=temp.val
                if temp.left:
                    queue.append(temp.left)
                if temp.right:
                    queue.append(temp.right)
            av=round(prev/size,5)
            r.append(av)
        return r