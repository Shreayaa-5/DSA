class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> st=new Stack<>();
        int n=nums.length;
        int curmin=nums[0];

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]<=nums[i]){
                st.pop();
            }
            if(!st.isEmpty() && nums[i]>st.peek()[1]){
                return true;
            }
            st.push(new int[] {nums[i],curmin});
            curmin=Math.min(curmin,nums[i]);
        }
        return false;

    }
}