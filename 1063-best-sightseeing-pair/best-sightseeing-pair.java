class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int result=0;
        int maxi=values[0];

        for(int j=1;j<values.length;j++){
            result=Math.max(result,maxi+values[j]-j);
            maxi=Math.max(maxi,values[j]+j);
        }
        return result;
    }
}