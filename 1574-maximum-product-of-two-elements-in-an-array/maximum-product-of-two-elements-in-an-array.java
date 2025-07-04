class Solution {
    public int maxProduct(int[] nums) {
        //BUBBLE SORT
        int[] arr=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            arr[k]=nums[k];
        }
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println(nums[nums.length-1]);
        System.out.println(nums[nums.length-2]);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        

    }
}