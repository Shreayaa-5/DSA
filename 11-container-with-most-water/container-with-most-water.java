class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int total=0;
        while(left<right){
            //multiple width and height
            //selecting min height because overflow will be caused otehrwise
            total=Math.max(total,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return total;
    }
}