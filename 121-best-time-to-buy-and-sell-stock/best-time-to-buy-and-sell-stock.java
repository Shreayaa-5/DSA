class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int ans=0;
        for(int a:prices){
            if(a<minprice){
                minprice=a;
            }else{
                ans=Math.max(ans,a-minprice);
            }
        }
        return ans;
    }
}