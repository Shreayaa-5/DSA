class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        k=k%n;
        if(n<=1) return;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}