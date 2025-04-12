class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sofar=nums[0];
        int curr_max=nums[0];
        int min_sofar=nums[0];
        int curr_min=nums[0];
        int total=0;
        for(int i=1;i<nums.length;i++){
            curr_max=Math.max(nums[i],nums[i]+curr_max);
            max_sofar=Math.max(curr_max,max_sofar);

            curr_min=Math.min(nums[i],nums[i]+curr_min);
            min_sofar=Math.min(curr_min,min_sofar);
        }

        for(int num:nums){
            total+=num;
        }
        if(max_sofar<0){
            return max_sofar;
        }
        //maximum circular subarray sum — by subtracting the minimum subarray (i.e., the worst part in the middle)
        return Math.max(max_sofar,total-min_sofar);

    }
}