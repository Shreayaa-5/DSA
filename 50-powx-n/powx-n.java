class Solution {
    public double myPow(double x, int n) {
        long nn=Math.abs((long)n);
        double result=1.0;
        while(nn>=1){
            if(nn%2==1){
                result*=x;
            }
            x*=x;
            nn/=2;
        }
        return (n<0) ? 1/result:result;
    }
}