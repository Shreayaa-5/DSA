class Solution {
    public int maxSubArray(int[] nums) {
        int max_sofar=nums[0];
        int curr_max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_max=Math.max(nums[i],curr_max+nums[i]);
            max_sofar=Math.max(curr_max,max_sofar);
        }
        return max_sofar;
    }
}