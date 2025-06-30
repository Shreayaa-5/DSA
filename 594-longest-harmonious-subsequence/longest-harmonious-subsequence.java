class Solution {
    public int findLHS(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            boolean has=false;
            int max=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]-max==1 ){
                    count++;
                    has=true;
                }
                else if(max==nums[j]){
                    count++;
                }
            }
            if(has){
                result=Math.max(result,count);
            }
        }
        return result;
    }
}