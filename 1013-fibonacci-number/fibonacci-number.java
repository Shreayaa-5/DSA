class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return helper(n, dp);
    }

    private int helper(int n, int[] dp) {
        if(dp[n]!=-1) return dp[n];
        if(n<=1) return n;
        return dp[n]=helper(n-1,dp)+helper(n-2,dp);
    }}