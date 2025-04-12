class Solution {
    public int maxProduct(int[] nums) {
        int max_sofar=nums[0];
        int curr_max=nums[0];
        int curr_min=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=curr_max;
            curr_max=Math.max(nums[i],Math.max(nums[i]*curr_max,nums[i]*curr_min));
            curr_min=Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*curr_min));
            max_sofar=Math.max(max_sofar,curr_max);
        }
        return max_sofar;
    }
}