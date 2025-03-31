class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int large=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            large=Math.max(large,sum);
        }
        return (double) large/k;
    }
}