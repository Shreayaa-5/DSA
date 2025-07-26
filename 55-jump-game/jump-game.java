class Solution {
    public boolean canJump(int[] nums) {
        int index=0;
        for(int i=0;i<=index;i++){
            if(index<nums.length-1){
                index=Math.max(nums[i]+i,index);
            }
            else if(index>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}