class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int result=0;
        int[][] arr=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][1]=i;
            arr[i][0]=nums[i];
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        int[][] topK = Arrays.copyOfRange(arr, 0, k);

        // Sort selected elements by original index to restore order
        Arrays.sort(topK, (a, b) -> a[1] - b[1]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=topK[i][0];
        }
        return res;
    }
}