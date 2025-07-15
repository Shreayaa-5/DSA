class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<=ans;i++){
            ans=Math.max(ans,nums[i]+i);
            if(ans>=n-1) return true;
        }
        return false;
    }
}