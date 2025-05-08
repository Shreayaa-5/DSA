# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        if root is None:
            return []
        queue=[root]
        swap=True
        r=[]
        while queue:
            levelsize=len(queue)
            levelnode=[]
            for _ in range(levelsize):
                temp=queue.pop(0)
                levelnode.append(temp.val)
                if temp.left:
                    queue.append(temp.left)
                if temp.right:
                    queue.append(temp.right)
            if not swap:
                r.append(levelnode[::-1])
                swap=not swap
            else:
                r.append(levelnode)
                swap=not swap
        return r
        