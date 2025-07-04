class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Quick Sort
        int targetIndex = nums.length - k;
        return quickselect(nums, 0, nums.length - 1, targetIndex);

    }
    public int quick(int[] arr,int lowerbound,int upperbound){
        int pivot=arr[lowerbound];
        int start=lowerbound+1;
        int end=upperbound;
        while(start<=end){
            while(start<=upperbound && arr[start]<=pivot){
                start++;
            }
            while(end >=lowerbound && arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            
        }
        int t=arr[lowerbound];
        arr[lowerbound]=arr[end];;
        arr[end]=t;
        return end;
    }
    public int quickselect(int[] arr, int lowerbound, int upperbound, int targetIndex) {
        if (lowerbound <= upperbound) {
            int pivotIndex = quick(arr, lowerbound, upperbound); // Partition using front pivot

            if (pivotIndex == targetIndex) {
                return arr[pivotIndex];
            } else if (pivotIndex < targetIndex) {
                return quickselect(arr, pivotIndex + 1, upperbound,targetIndex);
            } else {
                return quickselect(arr, lowerbound, pivotIndex - 1, targetIndex);
            }
        }
        return -1; // Shouldn't happen for valid input
    }
}