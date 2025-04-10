class Solution {
    public int maxSubArray(int[] nums) {
        int ans=0;
        int sum=Integer.MIN_VALUE;
        for(int r=0;r<nums.length;r++){
            ans+=nums[r];
            if(ans>sum){
                sum=ans;
            }
            if(ans<0){
                ans=0;
            }
        
        }
        return sum;
    }
}