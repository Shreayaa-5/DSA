class Solution {
    public int differenceOfSum(int[] nums) {
        int ele=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
            ele+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                dig+=n%10;
                n=n/10;
            }
        }
        System.out.print(ele+" "+dig+"//");
        return Math.abs(ele-dig);
    }
}