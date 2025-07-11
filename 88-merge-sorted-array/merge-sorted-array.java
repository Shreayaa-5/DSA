class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] temp=new int[m];
        for(int k=0;k<m;k++){
            temp[k]=nums1[k];
        }
        int l=0;
        while(i<m && j<n){
            if(temp[i]<nums2[j]){
                nums1[l++]=temp[i++];
            }else{
                nums1[l++]=nums2[j++];
            }
        }
        while(i<m){
            nums1[l++]=temp[i++];
        }
        while(j<n){
            nums1[l++]=nums2[j++];
        }
    }
}