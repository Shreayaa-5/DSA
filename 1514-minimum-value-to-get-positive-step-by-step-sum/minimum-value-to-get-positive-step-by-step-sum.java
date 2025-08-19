class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int minprefix=0;
        for(int n:nums){
            sum+=n;
            minprefix=Math.min(minprefix,sum);
        }
        return 1-minprefix;
    }
}