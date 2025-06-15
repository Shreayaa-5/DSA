class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!s.isEmpty() && s.peek()<=heights[i]){
                s.pop();
                count++;
            }
            if(!s.isEmpty()){
                count++;
            }
            ans[i]=count;
            s.push(heights[i]);
        }
        return ans;
    }
}