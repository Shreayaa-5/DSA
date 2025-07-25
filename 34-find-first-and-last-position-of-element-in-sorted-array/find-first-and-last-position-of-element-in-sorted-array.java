class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=find(nums,target,true);
        int last=find(nums,target,false);
        return new int[]{first,last};
    }
    public int find(int[] nums,int target,boolean ans){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result=mid;
                if(ans){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
}