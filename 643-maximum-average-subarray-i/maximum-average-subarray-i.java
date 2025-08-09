class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int largest=0;
        for(int i=0;i<k;i++){
            largest+=nums[i];
        }
        int inter=largest;
        for(int i=k;i<nums.length;i++){
            inter-=nums[i-k];
            inter+=nums[i];
            largest=Math.max(inter,largest);
        }
        return (double) largest/k;
    }
}