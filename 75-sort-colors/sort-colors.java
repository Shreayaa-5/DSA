class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        //last loop no need coz already sorted 
        //selection sort
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }

    }
}