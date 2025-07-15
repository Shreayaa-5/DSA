class Solution {
    public int jump(int[] nums) {
        //int ans=0;
        int n=nums.length;
        if(n==1) return 0;
        int count=0;
        int farthest=0;
        int lastjump=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==lastjump){
                count++;
                lastjump=farthest;
            }
        }
        return count;
    }
}