class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    int zeros=0;
    zeros=nums1.length-m;
    System.out.println(zeros);
    
    //Points to the last element in the meaningful part of nums1
    int midx=m-1;
    //Points to the last element in nums2
    int nidx=n-1;
    //Points to the last index in nums1
    int right=m+n-1;
    while(nidx>=0){
        if(midx>=0 && nums1[midx] > nums2[nidx]){
            nums1[right]=nums1[midx];
            midx--;
        }else{
            nums1[right]=nums2[nidx];
            nidx--;
        }
        right--;
    }
    }
}