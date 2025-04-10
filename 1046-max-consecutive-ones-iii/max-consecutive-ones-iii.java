class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int maxlen=0;
        int maxcount=0;
        int[] count=new int[2];
        for(int r=0;r<nums.length;r++){
            count[nums[r]]++;
            if(r-left+1-count[1]>k){
                count[nums[left]]--;
                left++;
            }
            maxlen=Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}